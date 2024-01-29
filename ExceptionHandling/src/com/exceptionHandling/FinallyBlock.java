package com.exceptionHandling;

public class FinallyBlock {
   public static void m1(){
	   try{
		   int a =10;
		   System.out.println(a/0);
	   }catch(NullPointerException e){
		   System.out.println("Exception handled by catch block");
	   }finally{
		   System.out.println("finally block executed");
	   }
   }
	public static void main(String[] args) {
		m1();

	}

}
