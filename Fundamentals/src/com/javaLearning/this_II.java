package com.javaLearning;

class VehicleData{
	int wheels;
	String name;
	
	VehicleData(int wheels, String name){
		this.wheels = wheels;
		this.name = name;
	}
	
	public void show(){
		System.out.println(wheels+" "+name);
	}
}
public class this_II {

	public static void main(String[] args) {
		VehicleData obj = new VehicleData(4,"Santro");
		obj.show();

	}

}
