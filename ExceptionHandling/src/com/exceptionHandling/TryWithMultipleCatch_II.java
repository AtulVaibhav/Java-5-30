package com.exceptionHandling;

public class TryWithMultipleCatch_II {
	public static void m1(){
		   try{
			  String str = "123abc";
			  int num = Integer.parseInt(str);
			  System.out.println(num);
		   }catch(ArithmeticException ae){
			  System.out.println("1st catch block handled exception"); 
		   }catch(NullPointerException npe){
			   System.out.println("2nd catch block handled exception"); 
		   }catch(ArrayIndexOutOfBoundsException ae){
			   System.out.println("3rd catch block handled exception"); 
		   }
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        m1();
	}

}
