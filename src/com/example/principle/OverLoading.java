package com.example.principle;

public class OverLoading {

	public static void main(String[] args) {
		
		OverLoading ol = new OverLoading();
		ol.getData(2);
		ol.getData("Overloading");
		ol.getData("check", 100);
	}

	public void getData(int a) {

		System.out.println(a);
	}

	public void getData(String a) {
		System.out.println(a);
	}
	public void getData(String a, int b) {
		System.out.println(a);
	}

}
