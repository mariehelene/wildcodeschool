package fr.wildcodeschool.githubtracker.dao;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.wildcodeschool.githubtracker.model.Githuber;

import javax.inject.Inject;
import java.io.IOException;
import java.net.URL;

public class GithubUtils {

    @Inject
    ObjectMapper om;

    public Githuber parseGithuber(String login) throws IOException {
        URL url = new URL("https://api.github.com/users/" + login);
        return om.readValue(url, Githuber.class);
    }
}
