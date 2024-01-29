package com.interfaces;
//inside interface,we can have static methods
//inside interface,we can have concrete methods with default keyword
interface X{
	
	public default void m1(){
		System.out.println("default method from interface");
	}
	public static void m2(){
		System.out.println("static method from interface");
	}
}

class Y implements X{
	
}
public class Test3 {

	public static void main(String[] args) {
		X.m2();
        Y y  = new Y();
        y.m1();
	}

}
