package com.inheritance;

class VehicleData{
	String engineType = "petrol-engine";
}
class FourWheelerData extends VehicleData{
	String nameOfVehicle = "Santro";
}
class TwoWheeler extends VehicleData{
	String nameOfVehicle = "KTM";
}
public class Hierarchical_Inheritance {

	public static void main(String[] args) {
		FourWheelerData fourWheeler = new FourWheelerData();
		System.out.println(fourWheeler.nameOfVehicle);
		System.out.println(fourWheeler.engineType);
		
		TwoWheeler twoWheeler =new TwoWheeler();
		System.out.println(twoWheeler.nameOfVehicle);
		System.out.println(twoWheeler.engineType);

	}

}
