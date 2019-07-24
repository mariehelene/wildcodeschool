package fr.wildcodeschool.jdbc.controller;

import com.mysql.cj.jdbc.Driver;
import fr.wildcodeschool.jdbc.model.JediMaster;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;

@WebServlet(name = "JediServlet", urlPatterns = {"/jedimasters"})
public class JediServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        /* pour Chargement du driver JDBC pour MySQL */
        String url = "jdbc:mysql://localhost:3306/starwars?serverTimezone=CET";
        String user = "root";
        String password = "root";
        Connection connection = null;

        /* pour stocker résultats select */
        ArrayList<JediMaster> jedimasters = new ArrayList<JediMaster>();

        try {
            Class<?> driverClass = Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, password);

            /* Requetes */
            String myQuery = "SELECT * FROM jedi_masters";
            Statement statement = null;


            try {
                /* Création de l'objet gérant les requêtes */
                statement = connection.createStatement();
                // statement = conn.createStatement(TYPE_SCROLL_INSENSITIVE, CONCUR_READ_ONLY); // autres options si besoin
                 ResultSet result = statement.executeQuery(myQuery);
                 while (result.next()) {
                     int idJedi = result.getInt( "id" );
                     String nameJedi = result.getString( "name" );
                     String surnameJedi = result.getString( "surname" );
                     JediMaster jedi = new JediMaster(idJedi, nameJedi, surnameJedi);

                     jedimasters.add(jedi);
                    }

                    //PrintWriter out = response.getWriter();
                    //out.print(jedimasters);

                    // redirection vers la jsp truc
                    request.setAttribute( "jedimastersParm", jedimasters );
                    RequestDispatcher requestDispatcher = request.getRequestDispatcher("/jedimasters.jsp");
                    requestDispatcher.forward(request, response);

            }
                 finally {
                     if(statement != null) {
                         statement.close();
                     }
                 }
        }
        catch (ClassNotFoundException ex) {
            try {
                throw new SQLException("JDBC driver classes not found", ex);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (connection != null)
                try {
                    /* Fermeture de la connexion */
                    connection.close();
                } catch (SQLException ignore) {
                    /* Si une erreur survient lors de la fermeture, il suffit de l'ignorer. */
                }
        }
    }
}
