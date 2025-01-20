package com.example.collection;

import java.util.ArrayList;

public class ArrayListExample {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a = new ArrayList<String>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		
		
		b.add(1);
		b.add(2);
		b.add(3);
		
		for(int aa :b) {
			System.out.println(aa);
		}
		
		
		try {
			b.set(1, 4);
			//b.clear();
			
			for(int aa :b) {
				System.out.println(aa);
				
			}
		}catch(Exception e) {
			
			System.out.println(e);
		}
		{
		
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
			System.out.println(b.containsAll(a));
			System.out.println(b.indexOf(3));
	}
		
	}

}
