package com.exceptionHandling;

public class Test2 {
   public static void m1(){
	   try{
		   String str = null;
		   System.out.println(str.length()); 
	   }catch(NullPointerException ae){
		   System.out.println("Exception handled...");
	   }
	   System.out.println("m1() executed....");
   }
	public static void main(String[] args) {
		Test2.m1();

	}

}
