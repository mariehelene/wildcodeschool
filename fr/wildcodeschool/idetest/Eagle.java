package fr.wildcodeschool.idetest;

// classe héritée de Bird
public class Eagle extends Bird implements Fly {

	// attributs  
    private boolean flying;
    private int altitude;

    // constructeurs 
    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    // méthodes
    
    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }
}