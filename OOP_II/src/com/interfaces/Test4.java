package com.interfaces;

//Functional interface has exactly one abstract method.
//Use of functional interface :generate lambda expression
@FunctionalInterface
interface AB{
	void m1();
	public default void m2(){
		System.out.println("default method");
	}
	public static void m3(){
		System.out.println("static method");
	}
}
public class Test4 {

	public static void main(String[] args) {
		AB ab = ()->{System.out.println("Lambda Expression");};
		ab.m1();
	}

}
