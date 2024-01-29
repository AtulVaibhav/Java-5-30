package com.inheritance;

class Parent{
	Parent(){
		System.out.println("Parent class constructor called");
	}
}

class Child extends Parent{
	Child(){
		super();
		//this();
		System.out.println("Child class constructor called");
	}
}

public class Super_keyword {

	public static void main(String[] args) {
		Child ch = new Child();

	}

}
