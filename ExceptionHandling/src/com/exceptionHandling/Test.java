package com.exceptionHandling;

import java.util.Scanner;

public class Test {
    public static void m1(){
    	try{
    	System.out.println("m1() starts execution....");
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the first number :");
    	int num1 = sc.nextInt();
    	System.out.println("Enter the second number :");
    	int num2 = sc.nextInt();
    	int result = num1/num2;
    	System.out.println(result);
    	}catch(ArithmeticException ae){
    		System.out.println("Exception handled...");
    	}
    	System.out.println("m1() executed");
    
    }
	public static void main(String[] args) {
		Test.m1();

	}

}
