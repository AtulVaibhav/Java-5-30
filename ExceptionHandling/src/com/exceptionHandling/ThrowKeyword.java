package com.exceptionHandling;

public class ThrowKeyword {
    public static void onlineVoting(int age){
    	if(age<18){
    		throw new ArithmeticException();
    	}else{
    		System.out.println("Welcome to vote");
    	}
    }
	public static void main(String[] args) {
		onlineVoting(16);
	}

}
