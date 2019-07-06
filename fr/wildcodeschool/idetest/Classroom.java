package fr.wildcodeschool.idetest;

public class Classroom {

	// main

	public static void main(String[] args) {
		
		// méthode rapide :
		// Wilder wilder1 = new Wilder("Jean-Claude", true);
		// Wilder wilder2 = new Wilder("Henri");
		
		Wilder wilder1 = new Wilder();
		Wilder wilder2 = new Wilder();
		
		wilder1.setFirstname("Jean-Claude");
		wilder1.setAware(true);
		
		wilder2.setFirstname("Henri");
		
		System.out.println(wilder1.WhoAmI());
		System.out.println(wilder2.WhoAmI());
	
	}
}
