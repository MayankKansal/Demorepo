package com.example.principle;

public interface Animal {

	public void AnimalName();
	public void sound();


	
	  default void behave() {
	  
	  System.out.println("this is fromt the default method.");
	  
	  }
	 
	
}
