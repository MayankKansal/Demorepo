package com.example.collection;

import java.util.ArrayList;

public class ArrayListExample {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("mayank");
		a.add("AI");
		a.add("Java");
		a.add("Learning");
		
		
		System.out.println(a.get(3));
		
		for(int i=0; i<a.size();i++) {
			
			System.out.println(a.get(i));
		}
		
		System.out.println("--------------------------");
		
		for(String aa : a) {
			
			System.out.println(aa);
		}
		System.out.println("--------------------------");
		
		System.out.println(a.contains("AI"));
	}

}
