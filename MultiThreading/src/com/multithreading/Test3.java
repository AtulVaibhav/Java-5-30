package com.multithreading;

public class Test3 extends Thread{
    public void run(){ //Running
    	
    	try {
			Thread.sleep(1000);//Blocked
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	System.out.println("Hello");
    	
    	
    }
	public static void main(String[] args) {
		Test3 t = new Test3();//New
		
		t.start();//Runnable 
		

	}

}
