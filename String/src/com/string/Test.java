package com.string;

class Employee{
	public String toString(){
		return "Harsh";
	}
}
public class Test {

	public static void main(String[] args) {
		String str = "Java";
		System.out.println("Before modification");
		System.out.println(str);
		
		str.concat("Code");
		System.out.println("After modification");
		System.out.println(str);
		
		System.out.println("________________________");
		Employee e = new Employee();
		System.out.println(e);
	}

}
