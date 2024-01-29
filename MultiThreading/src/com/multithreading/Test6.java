package com.multithreading;

class A1 extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().getName()+" completed task");
	}
}
public class Test6 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("main thread started");
		A1 a = new A1();
		A1 a2 = new A1();
		a.start();
		a.join();
		
		a2.start();
		a2.join();
		System.out.println("main thread completed..");

	}

}
