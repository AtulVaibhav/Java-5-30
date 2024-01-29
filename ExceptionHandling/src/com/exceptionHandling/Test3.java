package com.exceptionHandling;

public class Test3 {
      public static void m1(){
    	  String str = null;
    	  System.out.println(str.length());
    	  try{
    		  int result = 12/0;
    		  System.out.println(result);
    	  }catch(NullPointerException npe){
    		  System.out.println("Exception handled...");
    	  }
      }
	public static void main(String[] args) {
		Test3.m1();

	}

}
