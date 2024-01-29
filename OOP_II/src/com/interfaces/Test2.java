package com.interfaces;
//methods inside interface : public and abstract
//can interface implements another interface :no
//can interface extends another interface :yes
//single class can implements any number of interfaces
interface B{
	void m1();
}
//interface can't implements another interface
//interface C implements B{
//	
//}

//interface can extends another interface
interface C extends B{
	void m2();
}

class BImpl implements B{
	public void m1(){
		System.out.println("Implemented inside BImpl class");
	}
}

class CImpl implements C{

	@Override
	public void m1() {
		System.out.println("Implemented inside CImpl from interface B");
		
	}

	@Override
	public void m2() {
		System.out.println("Implemented inside CImpl from interface C");
		
	}
	
}

public class Test2 {

	public static void main(String[] args) {
		//B ob = new B();interface can't be instantiated
		
		B obj = new BImpl();
		obj.m1();
		
		C obj2 = new CImpl();
		obj2.m1();
		obj2.m2();
	}

}
