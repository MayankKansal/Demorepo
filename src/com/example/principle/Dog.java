package com.example.principle;

public class Dog implements Animal {

	public static void main(String[] args) {

		Animal an = new Dog();

		an.AnimalName();
		an.sound();
		
		Dog dg = new Dog();
		
		dg.cow();
		an.behave();
		dg.sound();

	}
	
	public void cow() {
		
		System.out.println("class method");
	}

	@Override
	public void AnimalName() {
		System.out.println("Dog");

	}

	@Override
	public void sound() {
		System.out.println("Bark");

	}
	
	@Override
	public void behave() {
		System.out.println("Bark 1");

	}

}
