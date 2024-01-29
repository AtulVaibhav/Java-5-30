package com.reservationSystem;

public class Passenger extends Thread{
     private String userName;
     private int requiredSeats;
     private Booking booking;
     
     Passenger(String userName,int requestedSeats,Booking booking){
    	 this.userName = userName;
    	 this.requiredSeats = requestedSeats;
    	 this.booking = booking;
     }
     
     public void run(){
    	 try {
			this.getBookingStatus(this.userName,this.requiredSeats);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
     }

	private void getBookingStatus(String userName, int requiredSeats) throws InterruptedException {
		this.booking.ticketBooking(userName, requiredSeats);
		
	}
     
}
