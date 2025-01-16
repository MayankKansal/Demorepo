package com.example.principle;

public class VehicleChildClass extends VehicleParentClass {

	public void engine() {
		System.out.println("new generation engine");
	}

	public void color() {
		System.out.println(color);
	}

	public void childMethod() {

		System.out.println("child class method");
	}

	public void audioSystem() {

		System.out.println("child audio sound ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VehicleChildClass child = new VehicleChildClass();
		child.color();
		child.engine();
		child.brakes();
		child.audioSystem();
		VehicleParentClass parent = new VehicleParentClass();
		//parent.audioSystem();

		VehicleParentClass parent1 = new VehicleChildClass(); //
		parent1.audioSystem();
		// parent1.childMethod(); not allowed as accessing child class objects with
		// parent variable.

	}

}
