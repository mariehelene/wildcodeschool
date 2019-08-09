package fr.wildcodeschool.githubtracker.controller;

import fr.wildcodeschool.githubtracker.dao.DumbGithuberDAO;
import fr.wildcodeschool.githubtracker.dao.GithuberDAO;
import fr.wildcodeschool.githubtracker.service.GithubersService;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "GithubersServlet", urlPatterns = {"/githubers"})

public class GithubersServlet extends HttpServlet {

    @Inject GithubersService githubersService;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // redirection vers la jsp githuber
        // String login = "";
        request.setAttribute( "githubersParm", githubersService.getAllGithubers() );
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/githuber.jsp") ;
        requestDispatcher.forward(request, response) ;

    }
}
