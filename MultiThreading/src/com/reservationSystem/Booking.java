package com.reservationSystem;

public class Booking {
	static int availableSeats = 10;
	
	public synchronized void ticketBooking(String userName,int requestedSeats) throws InterruptedException{
		System.out.println("-------Welcome to IndianRailways--------");
		System.out.println("Hello "+userName+" RequestedSeats :"+requestedSeats);
		System.out.println("Checking for availability.Please wait.....");
		Thread.sleep(2000);
		if(availableSeats>=requestedSeats){
			availableSeats = availableSeats - requestedSeats;
			System.out.println("Hello "+userName+". Seats booked successfully");
			System.out.println();
			System.out.println();
		}else{
			System.out.println("Hello "+userName+".No seats available.Sorry for inconvience");
			System.out.println();
			System.out.println();
		
		}
		
	}

}
