package com.example.principle;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int a[] = new int[5];
		 * 
		 * for (int i = 0; i < a.length; i++) { System.out.println(a[i]);
		 * 
		 * } int b[] = { 2, 3, 4, 5, 6, 7, 8 }; for (int i = 0; i < b.length; i++) {
		 * System.out.println(b[i]);
		 * 
		 * }
		 */
		 
	    int[] numbers = {2,4,6,8,9};
	    
	    System.out.println(numbers[0]);
	    
	    System.out.println(numbers[4]);
	    
	    for(int i=numbers.length-1; i>0; i--){
	        
	        System.out.println(numbers[i]);
	    }
		
		int m[][] = new int[2][3];
		int n[][] = {{ 2, 3, 4},{ 6, 7, 8}};
		System.out.println(n.length);
		for (int i = 0; i < n.length; i++) {
			 for(int j=0; j<=n.length;j++) {
			
			System.out.println(n[i][j]);
			 }
		}
		
	}
	}

