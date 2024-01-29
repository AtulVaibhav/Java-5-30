package com.multithreading;

public class Test5 extends Thread{
    public void run(){
    	System.out.println(Thread.currentThread().getName());
    }
	public static void main(String[] args) {
		Test5 t = new Test5();
		t.setName("ThreadA");
		//System.out.println(t.getPriority());
		t.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t.getPriority());
		t.start();

	}

}
