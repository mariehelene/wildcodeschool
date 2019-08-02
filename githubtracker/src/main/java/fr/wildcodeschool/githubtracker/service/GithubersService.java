package fr.wildcodeschool.githubtracker.service;

import fr.wildcodeschool.githubtracker.dao.GithuberDAO;
import fr.wildcodeschool.githubtracker.model.Githuber;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;

@Dependent
public class GithubersService {

    private GithuberDAO dao;

    @Inject
    public GithubersService(GithuberDAO dao) {
        this.dao = dao;
    }

    public List<Githuber> getAllGithubers() {
        return dao.getGithubers();
    }

    public Githuber getGithuber(String login) {

        List<Githuber> githubers = dao.getGithubers();
        return githubers.stream().filter(gh -> gh.getLogin().equals(login))
                .findAny().orElse(null);

        /*
        for(int i = 0; i < githubers.size(); i++) {

            Githuber gh = githubers.get(i);
            if (gh.getLogin().equals(login)) {

                return gh;

            }


        }
        return null;
        */
    }

    public void track(String login) {
        // TODO
    }
}


