package com.example.mypackage;

public class Loop5 {

	public static void main(String[] args) {

		// increase loop
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*\t");
			}
			System.out.println("");
		}
		
		// decrease loop
		for (int i = 3; i >=0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*\t");
			}
			System.out.println("");
		}
	}
}
