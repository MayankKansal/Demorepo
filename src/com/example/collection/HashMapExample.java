package com.example.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hs = new HashMap<Integer, String>();
		
		hs.put(1, "Hi");
		hs.put(2, "Bye");
		hs.put(3, "Good");
		hs.put(4, "Morning");
		
		/*
		 * Set set = hs.entrySet(); 
		 * Iterator it = set.iterator(); 
		 * while(it.hasNext()){ 
		 * Map.Entry map =(Map.Entry)it.next();
		 * System.out.println(map.getValue());
		 *  }
		 */
		
		for(Map.Entry<Integer, String> map :hs.entrySet()) {
			
			System.out.println(map.getValue());
		}
		
	}

}
