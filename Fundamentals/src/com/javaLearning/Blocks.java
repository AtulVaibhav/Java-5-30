package com.javaLearning;

public class Blocks {
	//static block
	
   static{
	   System.out.println("static block executed");
   }
   
   //Instance-Initialization block
   {
	   System.out.println("IIB executed");
   }
	public static void main(String[] args) {
		Blocks b1 = new Blocks();
		Blocks b2 = new Blocks();

	}

}
