package com.multithreading;

class MyThread2 implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	
}
public class Test2 {

	public static void main(String[] args) {
		
		MyThread2 t1 = new MyThread2();
		MyThread2 t2 = new MyThread2();
		
		Thread one = new Thread(t1);
		Thread two = new Thread(t2);
		
		one.start();
		two.start();

	}

}
