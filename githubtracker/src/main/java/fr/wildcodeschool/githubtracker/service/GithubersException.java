package fr.wildcodeschool.githubtracker.service;

import java.sql.SQLException;

public class GithubersException extends Exception {

    GithubersException(String str, SQLException e)
    {
        super(str);
    }
}
