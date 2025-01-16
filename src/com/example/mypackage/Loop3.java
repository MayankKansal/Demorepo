package com.example.mypackage;

public class Loop3 {

	public static void main (String[] args) {
		
		//int k=1;
		
		for (int i = 1; i<=4;i++) {
			
			for (int j=1; j<i+1;j++) {    // j<=i
				
				System.out.print(j);
				System.out.print("\t");
			//	k++;
			}
			
			System.out.println("");
		}
	}
}
