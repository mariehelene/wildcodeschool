package fr.wildcodeschool.wilder;

public class Wilder {
	
    private String firstname;
    private boolean aware;

    // constructeurs
    
	public Wilder() {

		this.firstname = "";
		this.aware = false;
		
	}
	
	public Wilder(String firstname) {

		this.firstname = firstname;
		this.aware = false;
		
	}
	
	public Wilder(String firstname, boolean aware) {

		this.firstname = firstname;
		this.aware = aware;
		
	}
	
	//  getter firstname
	
	public String getFirstname() {
		
	    return this.firstname;
	    
	}
	
	// getter aware
	
	public boolean isAware() {
		
	    return this.aware;
	    
	}
	
	//  setter firstname
	
	public void setFirstname(String firstname) {
		
	    this.firstname = firstname;
	    
	}
	
	// setter aware
	
	public void setAware(boolean aware) {
		
	    this.aware = aware;
	    
	}
	
	public String WhoAmI() {
		
		if (this.isAware() == true)
			return("Je m'appelle " + this.getFirstname() + " et je suis aware");
		else
			return("Je m'appelle " + this.getFirstname() + " et je ne suis pas aware");
	}
	

}
