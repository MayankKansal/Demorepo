package com.example.keywords;

public class ExceptionDemo {

	int a = 4;

	int b = 7;

	int c = 0;

	public void arrayError() {
		try {
			int arr[] = new int[5];
			System.out.println(arr[7]);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("this is an index error");
		}finally{
			System.out.println("i'm finally block 1");
		}

	}

	public void display() {
		try {
			int k = b / c;
			System.out.println(k);
		} catch (ArithmeticException e) {
			System.out.println(e);
			arrayError();
		} catch (Exception e) {
			System.out.println("this is an error");
		}
		
		finally{
			System.out.println("i'm finally block 2");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExceptionDemo ex = new ExceptionDemo();
		ex.display();

	}

}
