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

    // héritée de Bird
    
    @Override
    public String sing() {
        return "Screech!";
    }
    
    // héritées de Fly   
    
    @Override
    public void takeOff() {
    	if (!this.flying && this.altitude == 0) {
            this.flying = true;
            System.out.printf("%s takes off in the sky.%n", this.getName());
        }
	}
    
    @Override
    public int ascend(int meters) {
    	
    	if (this.flying) {
            this.altitude = Math.min(this.altitude + meters, 325);
            System.out.printf("%s flies upward, altitude : %d%n", this.getName(), this.altitude);
        }
        return this.altitude;

    }
    
    @Override
    public int descend(int meters) {
    	
    	if (this.flying) {
            this.altitude = Math.max(this.altitude - meters, 0);
            System.out.printf("%s flies downward, altitude : %d%n", this.getName(), this.altitude);
        }
        return this.altitude;
    }
    
    /**
     * land, must be at altitude 0
     */
    @Override
    public void land() {
    	
    	if (this.flying && this.altitude == 0) {
            System.out.printf("%s lands on the ground.%n", this.getName());
        } else {
            System.out.printf("%s is too high, it can't land !%n", this.getName());
        }
    	
	}

}