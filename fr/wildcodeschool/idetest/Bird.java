package fr.wildcodeschool.idetest;

public abstract class Bird {
	  
    // attributs  
    private String name;  
    private int age;
  
    // constructeurs  
    public Bird(String name) {  
        this.name = name;  
        this.age = 0;  
    }  
  
    // accesseurs et mutateurs  
    public String getName() {  
        return this.name;  
    }  
  
    public void setName(String name) {  
        this.name = name;  
    }  
  
    public int getAge() {  
        return this.age;  
    }  
  
    public void setAge(int age) {
        this.age = age;
    }

    // m�thodes
    public abstract String sing();
}