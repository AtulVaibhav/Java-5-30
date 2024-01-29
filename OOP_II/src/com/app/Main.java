package com.app;

public class Main {

	public static void main(String[] args) {
		Airtel airtel = new Airtel(1234,"Airtel");
		JIO jio = new JIO(2121,"JIO Networks");
		Idea idea = new Idea(3131,"IDEA");
		
		Mobile mobile = new Mobile(idea);
		System.out.println(mobile.getSim());

	}

}
