package com.string;

public class Test2 {

	public static void main(String[] args) {
		String str = "Hello";
		String str1 = "Hello";
		if(str.hashCode()==str1.hashCode()){
			System.out.println("Points to same object");
		}else{
			System.out.println("Points to different object");
		}
	}

}
