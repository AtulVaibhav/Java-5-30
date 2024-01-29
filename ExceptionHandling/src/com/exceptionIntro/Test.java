package com.exceptionIntro;

public class Test {

	public static void main(String[] args) {
		System.out.println("stmt 1");
		System.out.println("stmt 2");
		int result = 12/0;//program terminates here
		System.out.println("stmt 3");
		System.out.println("stmt 4");
		System.out.println("stmt 5");
	}

}
