package com.multithreading;

class MyThread extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().getName());
	}
}
public class Test1 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
        MyThread t1 = new MyThread();
        t1.start();
	}

}
