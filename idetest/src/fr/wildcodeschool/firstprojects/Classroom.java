package fr.wildcodeschool.firstprojects;

import fr.wildcodeschool.wilder.Wilder;

public class Classroom {

	// main

	public static void main(String[] args) {
		
		// m�thode rapide :
		// fr.wildcodeschool.wilder.Wilder wilder1 = new fr.wildcodeschool.wilder.Wilder("Jean-Claude", true);
		// fr.wildcodeschool.wilder.Wilder wilder2 = new fr.wildcodeschool.wilder.Wilder("Henri");
		
		Wilder wilder1 = new Wilder();
		Wilder wilder2 = new Wilder();
		
		wilder1.setFirstname("Jean-Claude");
		wilder1.setAware(true);
		
		wilder2.setFirstname("Henri");
		
		System.out.println(wilder1.WhoAmI());
		System.out.println(wilder2.WhoAmI());
	
	}
}
