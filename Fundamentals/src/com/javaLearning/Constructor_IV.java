package com.javaLearning;

class Employee{
	int id;
	String name ;
	
	public Employee(int empId,String empName){
		id = empId;
		name = empName;
	}
	
	public void show(){
		System.out.println("Id:"+id+" name :"+name);
	}
}
public class Constructor_IV {

	public static void main(String[] args) {
		Employee e1 = new Employee(101,"Arjun");
		e1.show();
		
		Employee e2 = new Employee(102,"Harsh");
		e2.show();

	}

}
