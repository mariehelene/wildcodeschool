package fr.wildcodeschool.githubtracker.dao;

import fr.wildcodeschool.githubtracker.model.Githuber;

import javax.enterprise.context.Dependent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Dependent
public class DumbGithuberDAO implements GithuberDAO {

    @Override
    public List<Githuber> getGithubers() {

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

        Collections.unmodifiableList(githubers);

        return githubers;
    }

    @Override
    public void saveGithuber(Githuber githuber) {
        throw new UnsupportedOperationException("Invalid operation");
    }


}
