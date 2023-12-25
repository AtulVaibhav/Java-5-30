package com.javaLearning;

class Box{
	Box(){
		System.out.println("default constructor");
	}
	
	Box(int data){
		this();
		System.out.println("parameterized constructor");
	}
}
public class this_III {

	public static void main(String[] args) {
		Box b1 = new Box(10);

	}

}
