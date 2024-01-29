package com.multithreading;

class Table{
	public synchronized void print(int num){
		for(int i=1;i<=10;i++){
			System.out.println(Thread.currentThread().getName()+
					"--> "+num +" * "+i+" = "+(num*i) );
		}
	}
}
class ThreadA extends Thread{
	private Table table;
	ThreadA(Table table){
		this.table = table;
	}
	public void run(){
		this.table.print(2);
	}
}
class ThreadB extends Thread{
	private Table table;
	ThreadB(Table table){
		this.table = table;
	}
	public void run(){
		this.table.print(5);
	}
}
class ThreadC extends Thread{
	private Table table;
	ThreadC(Table table){
		this.table = table;
	}
	public void run(){
		this.table.print(10);
	}
}
public class Test7 {

	public static void main(String[] args) {
	 Table table = new Table();
	 ThreadA t1 = new ThreadA(table);
	 ThreadB t2 = new ThreadB(table);
	 ThreadC t3 = new ThreadC(table);
	 t1.setName("A");
	 t2.setName("B");
	 t3.setName("C");
	 
	 t1.start();
	 t2.start();
	 t3.start();
	 
	 
	}

}
