package fr.wildcodeschool.githubtracker.controller;

import fr.wildcodeschool.githubtracker.model.Githuber;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(name = "GithubersServlet", urlPatterns = {"/githubers"})

public class GithubersServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // instanciation liste de 5 githubers


        Githuber githuber1 = new Githuber("Ernest D", "ernest@gmail.com", "ernest", 1, "pictures/man1.png");
        Githuber githuber2 = new Githuber("Joe C", "joe@gmail.com", "joe",2, "pictures/man2.png");
        Githuber githuber3 = new Githuber("Marie A", "marie@gmail.com", "marie", 3, "pictures/woman1.png");
        Githuber githuber4 = new Githuber("Christine Z", "christine@gmail.com", "chris",4, "pictures/woman2.png");
        Githuber githuber5 = new Githuber("Emma Y", "emma@gmail.com", "emma", 5, "pictures/woman3.png");

        ArrayList<Githuber> githubers = new ArrayList<Githuber>();
        githubers.add(githuber1);
        githubers.add(githuber2);
        githubers.add(githuber3);
        githubers.add(githuber4);
        githubers.add(githuber5);



        //PrintWriter out = response.getWriter();
        //out.print(githubers);


        // redirection vers la jsp githuber
        request.setAttribute( "githubersParm", githubers );
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/githuber.jsp") ;
        requestDispatcher.forward(request, response) ;

    }
}
