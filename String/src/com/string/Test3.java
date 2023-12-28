package com.string;

public class Test3 {

	public static void main(String[] args) {
		String str = new String("Java");
		String str1 = new String("Java");
		if(str.hashCode()==str1.hashCode()){
			System.out.println("Points to same object");
		}else{
			System.out.println("Points to different object");
		}
	}

}
