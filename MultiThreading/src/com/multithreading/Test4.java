package com.multithreading;


class A extends Thread{
	public void run(){
		for(int i=1;i<=5;i++){
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
}
public class Test4 {

	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A();
		
		a1.start();
		//a1.start();
		a2.start();

	}

}
