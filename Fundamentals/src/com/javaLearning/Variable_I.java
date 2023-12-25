package com.javaLearning;
/**
 * Instance Variable
 * -variable defined outside function
 * -object is mandatory to access
 * -every object is having its own copy of instance variable.
 * -syntax: data_type nameOfVariable = value;
 */
public class Variable_I {
    //instance variable
	int a = 20;
	char b = 'X';
	boolean c = true;
	float d = 24.56f;
	
	public static void main(String[] args) {
	// creating an object
      // className objName = new className();
		Variable_I obj = new Variable_I();
		
		//syntax to access instance variable:objName.varName
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
		
		
		
		Variable_I obj1 = new Variable_I();
		Variable_I obj2 = new Variable_I();
		System.out.println("Current value of a:");
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		
		System.out.println("After modification");
		obj1.a = 100;
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		
		}

}
