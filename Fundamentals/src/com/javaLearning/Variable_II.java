package com.javaLearning;
/**
 * Static Variable:
 * -static keyword required
 * -related to class
 * -in order to access the static data,className is require
 * -every object is sharing same static data
 */
public class Variable_II {
	//static variable
    static int data = 200;
	public static void main(String[] args) {
		System.out.println(Variable_II.data);
		Variable_II obj1  = new Variable_II();
		Variable_II obj2 = new Variable_II();
		System.out.println("Before updating data");
		System.out.println(obj1.data);
		System.out.println(obj2.data);
		
		System.out.println("After updating data");
		obj1.data = 500;
		System.out.println(obj1.data);
		System.out.println(obj2.data);
		
		
		
	}

}
