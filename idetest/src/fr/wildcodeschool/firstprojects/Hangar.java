package fr.wildcodeschool.firstprojects;

public class Hangar {

	// main

	public static void main(String[] args) {
		
		Vehicle vehicle1 = new Car("Clio");
		Vehicle vehicle2 = new Car("Alfa Rom�o");
		Vehicle vehicle3 = new Boat("Titanic");
		
		System.out.println(vehicle1.doStuff());
		System.out.println(vehicle2.doStuff());
		System.out.println(vehicle3.doStuff());
	}
}
