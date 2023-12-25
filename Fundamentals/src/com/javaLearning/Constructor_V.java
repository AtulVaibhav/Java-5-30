package com.javaLearning;

class Vehicle{
	int wheels;
	String color;
	
	Vehicle(int numberOfWheels,String colorName){
		wheels = numberOfWheels;
		color = colorName;
	}
	
	Vehicle(Vehicle obj){
		wheels = obj.wheels;
		color = obj.color;
	}
	
	public void show(){
		System.out.println(wheels+" "+color);
	}
}
public class Constructor_V {

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle(4,"red");
		v1.show();
		
		Vehicle v2 =  new Vehicle(v1);
         v2.show();
	}

}
