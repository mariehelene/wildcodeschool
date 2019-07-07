package fr.wildcodeschool.idetest;

// classe h�rit�e de Bird
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

    // m�thodes
    
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