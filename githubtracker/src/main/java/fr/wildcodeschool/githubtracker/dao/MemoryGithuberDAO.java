package fr.wildcodeschool.githubtracker.dao;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.wildcodeschool.githubtracker.model.Githuber;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.io.IOException;
import java.net.URL;
import java.util.*;

@ApplicationScoped
@InMemory
public class MemoryGithuberDAO implements GithuberDAO {

    Map<String, Githuber> githubers = new HashMap<>();


    @Inject
    GithubUtils githubUtils;


    @Override
    public List<Githuber> getGithubers() {
        return new ArrayList<>(githubers.values());
    }

    @Override
    public void saveGithuber(Githuber githuber) {
        githubers.put(githuber.getLogin(), githuber);
    }

    /*
    public Githuber parseGithuber(String login) throws IOException {
        URL url = new URL("https://api.github.com/users/" + login);
        return om.readValue(url, Githuber.class);
    }
    */

    @PostConstruct
    private void mhd() {
        try {
            saveGithuber(githubUtils.parseGithuber("ernest"));
            saveGithuber(githubUtils.parseGithuber("joe"));
            saveGithuber(githubUtils.parseGithuber("marie"));
            saveGithuber(githubUtils.parseGithuber("chris"));
            saveGithuber(githubUtils.parseGithuber("emma"));
        }
        catch(IOException e) {
            throw new RuntimeException(e);
        }
    }


}
