package com.polymorphism;
class Parent{
	
	int data=100;
	public double area(int num){
		return (Math.PI*num*num);
	}
}

class Child extends Parent{
	
	int data = 200;
	@Override
	public double area(int num){
		System.out.println("Child class");
		return (num*num);
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
//		Child ch = new Child();
//		System.out.println(ch.area(10));

		
		Parent ref = new Child();
		System.out.println(ref.data);
		
		//System.out.println(ref.area(10));
	}

}
