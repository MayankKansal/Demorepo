package com.example.keywords;

public class thisDemo {

	
	 int a =4;
	 
	 public void getData(int a) {
		 
		// int a =6;
		// this.a =a;   //this here is refer to class variable where we are putting 6 into it
		 System.out.println(a);
		 System.out.println(this.a);
	 }
	 
	 String name = "parent" ;

	    void Student(String name) {
	        this.name = name; // Resolves ambiguity
	       System.out.println(name);
	       System.out.println("git sample");
	       System.out.println("git sample2");
	       System.out.println("git develope branch");
	    }
	    
	    public void display() {
	    	  System.out.println(name);
	    }
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		thisDemo th = new thisDemo();
		th.getData(6);
		//th.Student("child");
		th.display();
	}

}
