package com.example.collection;

import java.util.HashSet;
import java.util.Iterator;

public class SetExamples {
	
	public static void main (String[] args) {
		
		HashSet<String> sh = new HashSet<String>();
		
		sh.add("India");
		sh.add("UK");
		sh.add("USA");
		sh.add("MP");
		sh.add("MP1");
		sh.add("MP2");
		sh.add("MP3");
		sh.add("MP4");
		
		System.out.println(sh);
		Iterator<String> i= sh.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
			
		}
			
		
		
		
	}

}
