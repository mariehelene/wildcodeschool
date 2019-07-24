package fr.wildcodeschool.jdbc.model;

public class JediMaster {

    // attributs

    private Integer id;
    private String name;
    private String surname;

    // constructeurs

    public JediMaster(Integer id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    // accesseurs et mutateurs

    public Integer getId() {
        return this.id;
    }

    // public void setId(Integer id) { this.id = id; }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String email) {
        this.surname = surname;
    }

}
