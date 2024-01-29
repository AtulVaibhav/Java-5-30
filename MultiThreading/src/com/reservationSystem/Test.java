package com.reservationSystem;

public class Test {

	public static void main(String[] args) {
		Booking booking = new Booking();
		Passenger p1 = new Passenger("Aayush",7,booking);
		Passenger p2 = new Passenger("Harsh",8,booking);
		
		p1.start();
		p2.start();

	}

}
