package com.example.principle;

public class ChildAirCraft extends ParentAirCraft{
	
	public static void main(String [] args) {
		
		ChildAirCraft c = new ChildAirCraft();
		
		c.engine();
		c.color();
		c.safetyGuideLines();
		
	//	ParentAirCraft p = new ParentAirCraft(); // Not allowed
	}

	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("White color on te body");
	}

}
