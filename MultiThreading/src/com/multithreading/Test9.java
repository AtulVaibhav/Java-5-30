package com.multithreading;

class Account{
	int balAmount = 500;
	public synchronized void withdrawAmount(int withdrawAmount) throws InterruptedException{
		
		if(withdrawAmount>balAmount){
			System.out.println("Insufficient amount.Waiting for amount to be deposited");
			wait();
		}
		System.out.println("Amount debited successfully");
		
	}
	
	public synchronized void depositAmount(int depositedAmount){
		balAmount = balAmount+depositedAmount;
		System.out.println("Amount deposited");
		notify();
	}
}

class User_1 extends Thread{
	private Account account;
	User_1(Account account){
		this.account = account;
	}
	
	public void run(){
		try {
			this.account.withdrawAmount(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class User_2 extends Thread{
	private Account account;
	User_2(Account account){
		this.account = account;
	}
	
	public void run(){
		this.account.depositAmount(1500);
	}
}

public class Test9 {

	public static void main(String[] args) {
		Account account = new Account();
		User_1 user1 = new User_1(account);
		User_2 user2 = new User_2(account);
		
		user1.start();
		user2.start();

	}
}

