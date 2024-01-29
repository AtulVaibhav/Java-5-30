package com.exceptionHandling;

public class NestedTryCatch {
public static void m1(){
	try{
		System.out.println(12/4);
		try{
			String str = null;
			System.out.println(str.length());
		}catch(ArithmeticException npe){
			System.out.println("inner catch handled exception");
		}
	}catch(Exception e){
		System.out.println("outer catch handled exception");
	}
}
	public static void main(String[] args) {
		m1();

	}

}
