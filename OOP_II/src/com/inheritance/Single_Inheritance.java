package com.inheritance;

class A{
	int a = 10;
	private int x = 100;
	protected int data = 500;
	public void show(){
		System.out.println(this.a);
	}
}
class B extends A{
	int b=20;
	public void display(){
		System.out.println(this.b);
	}
}

public class Single_Inheritance {

	public static void main(String[] args) {
		A a = new A();
		a.show();
		//a.display();
		
		B b = new B();
		b.show();
		b.display();
		
		//System.out.println(b.x);
		System.out.println(b.data);
	}

}
