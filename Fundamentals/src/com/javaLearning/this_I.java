package com.javaLearning;

class Car{
	Car(){
		System.out.println("value of this :"+this.hashCode());
	}
}
public class this_I {

	public static void main(String[] args) {
		Car c1 = new Car();
		System.out.println("value of c1 ="+c1.hashCode());
		
		Car c2 = new Car();
		System.out.println("value of c2 ="+c2.hashCode());

	}

}
