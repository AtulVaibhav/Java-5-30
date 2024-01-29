package com.multithreading;


class SharedResource{
	public static final String resource1 = "Pen";
	public static final String resource2 = "Paper";
	
}

class User1 extends Thread{
	public void run(){
		synchronized (SharedResource.resource1) {
			System.out.println("User1 got pen..Waiting for paper");
			synchronized (SharedResource.resource2) {
				System.out.println("User1 got paper.Task completed");
			}
		}
	}
}

class User2 extends Thread{
	public void run(){
		synchronized (SharedResource.resource2) {
			System.out.println("User2 got paper..Waiting for pen");
			synchronized (SharedResource.resource1) {
				System.out.println("User2 got pen.Task completed");
			}
		}
	}
}

public class Test8 {

	public static void main(String[] args) {
		User1 t1 = new User1();
		User2 t2 = new User2();
		t1.start();
		t2.start();
	}

}
