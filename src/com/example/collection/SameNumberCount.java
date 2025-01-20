package com.example.collection;

import java.util.ArrayList;

public class SameNumberCount {

	public static void main(String[] args) {

		int a[] = { 2, 2, 4, 4, 4, 5, 6, 7, 5, 6 };

		ArrayList<Integer> arr = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {
			int k = 0;
			if (!arr.contains(a[i])) {
				arr.add(a[i]);
				k++;
				for (int j = i + 1; j < a.length; j++) {

					if (a[i] == a[j]) {

						k++;

					}

				}
				System.out.println(a[i] + " " + k);
				if(k==1) {
					System.out.println(a[i] + " is a unique nummber");
				}
			}

			
		}

	}

}
