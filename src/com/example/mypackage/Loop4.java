package com.example.mypackage;

public class Loop4 {

	public static void main(String[] args) {

		int k = 3;
		int m = 1;

		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= i; j++) {

				// System.out.print(k * ((i * (i - 1)) / 2 + j));

				System.out.print(k * m);
				System.out.print("\t");
				m++;
			}

			System.out.println("");
		}
	}
}
