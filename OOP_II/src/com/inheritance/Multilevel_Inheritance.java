package com.inheritance;

class Vehicle{
	String vehicle_type = "petrol-engine";
}
class FourWheeler extends Vehicle{
	int numberOfWheels =4;
}
class Car extends FourWheeler{
	String nameOfCar = "Santro";
}
public class Multilevel_Inheritance {

	public static void main(String[] args) {
		Car car = new Car();
		System.out.println(car.nameOfCar);
		System.out.println(car.numberOfWheels);
		System.out.println(car.vehicle_type);

	}

}
