package com.example.mypackage; 
public class Loops {

	public static void main(String[] args) {
		
		int k =1;
		for(int i =1;i<=4;i++) {
			
			for(int j=0; j<=4-i; j++) {
				
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			
			System.out.println("");
		}
	}
}
