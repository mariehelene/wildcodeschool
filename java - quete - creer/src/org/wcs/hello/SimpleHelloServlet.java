package org.wcs.hello;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SimpleHelloServlet", urlPatterns = {"/simple-hello"})

public class SimpleHelloServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        // get parameters from request
        String prenom = request.getParameter("firstname");
        String nom = request.getParameter("name");
        String heureTemp = request.getParameter("time");
        String heure = heureTemp.substring(0,2) + heureTemp.substring(3);

        // Good morning, Good afternoon ou Good night
        String message = "";
        int heureInt = Integer.parseInt(heure);
        if (heureInt < 1200) {
            message = "Good morning";
        } else {
            if (heureInt < 2000){
                message = "Good afternoon";
            } else {
                message = "Good night";
            }
        }
        message += " " + prenom + " " + nom + " !";

        // redirection vers la jsp custom-hello
        request.setAttribute( "mess", message );
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/custom-hello.jsp") ;
        requestDispatcher.forward(request, response) ;

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        //PrintWriter out = response.getWriter();
        //out.print("Simple hello!");

        // redirection vers la jsp hello-form
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/hello-form.jsp") ;
        requestDispatcher.forward(request, response) ;

    }
}
