package com.example.mypackage;

public class Stringdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String name = "Do your work now";
	//	String[] arr = name.split(" ");
		String[] arr = name.split("your");
		
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[1].trim());
		
		//System.out.println(arr[2]);
		
		for(int i =0; i<name.length();i++) {
			System.out.println(name.charAt(i));
		}
		System.out.println("------------------");
		for(int i =name.length()-1; i>=0; i--) {
			System.out.println(name.charAt(i));
		}
	
	}
	

}
