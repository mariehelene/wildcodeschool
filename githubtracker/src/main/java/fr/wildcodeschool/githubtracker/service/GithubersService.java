package fr.wildcodeschool.githubtracker.service;

import fr.wildcodeschool.githubtracker.dao.GithubUtils;
import fr.wildcodeschool.githubtracker.dao.GithuberDAO;
import fr.wildcodeschool.githubtracker.dao.InMemory;
import fr.wildcodeschool.githubtracker.dao.MemoryGithuberDAO;
import fr.wildcodeschool.githubtracker.model.Githuber;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.io.IOException;
import java.util.List;

@Dependent
public class GithubersService {


    @Inject @InMemory
    private GithuberDAO dao;

    // @Inject
    // public GithubersService(MemoryGithuberDAO dao) {
        // this.dao = dao;
    // }

    @Inject
    public GithubersService(@InMemory GithuberDAO dao) {
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

    // @Inject MemoryGithuberDAO memoryGithuberDAO;
    @Inject @InMemory GithuberDAO memoryGithuberDAO;
    @Inject
    GithubUtils githubUtils;

    public void track(String login) throws IOException {

        // récup données dans Github
        Githuber githuber = githubUtils.parseGithuber(login);

        // ajout dans liste
        memoryGithuberDAO.saveGithuber(githuber);

    }
}


