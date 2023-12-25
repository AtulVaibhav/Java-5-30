package com.javaLearning;

public class Method_I {

	//method definition
	public void greet(){
		System.out.println("Good Evening");
	}
	
	public void add(int i1,int i2){
		System.out.println("Addition :"+ (i1+i2));
	}
	// fn with return type
	public int getMultiplication(int i1,int i2){
		return (i1*i2);
	}
	public static void main(String[] args) {
		//call fn
		Method_I obj = new Method_I();
		obj.greet();
		obj.add(12, 13);
		int result = obj.getMultiplication(10, 11);
		System.out.println(result);
	}

}
