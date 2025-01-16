package com.example.keywords;

public class StaticVar {
	
	String name;					// instance variable
	String address;
	 static String city = "MRT";     // class variable
	 
	 static int i =0 ;
	
	StaticVar(String name, String address){
		
		this.name =name;
		this.address = address;
	//	this.city = city;
		i++;
		
		System.out.println(name+"  "+ address+"   "+ city);
		System.out.println(i);
		
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticVar obj = new StaticVar("Bobby", "JV"); 
		StaticVar obj1 = new StaticVar("lobby", "JV"); 
		
		thisDemo td = new thisDemo();   // Package example, method class from thisDemo class
		td.Student("Package");
	}

}
