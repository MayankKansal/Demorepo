package com.example.principle;

public class ConstructDemo {

	public ConstructDemo() {

		System.out.println("I'm from the explicit constructor");
	}
	
	public ConstructDemo(int a, int b) {

		System.out.println("I'm from the Parameterised constructor");
	}

	public static void main(String[] args) {

		ConstructDemo cd = new ConstructDemo();
		ConstructDemo cd1 = new ConstructDemo(5,5);
	}

}
