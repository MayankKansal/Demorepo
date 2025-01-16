package com.example.keywords;

public class childDemoSuperKeyword extends parentDemo {

	String name = "XYZ";

	public void getStringData() {

		System.out.println(name);
		System.out.println(super.name); // Variable usage

	}

	public void getData() {

		super.getData();  // Method Usage
		System.out.println("I'm from child class");

	}

	public childDemoSuperKeyword() {
		
		super("Parameterised constructor is called by super keyword"); // Constructor usage
		System.out.println("Child Class Constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		childDemoSuperKeyword cd = new childDemoSuperKeyword();
		cd.getStringData();
		cd.getData();
	}

}
