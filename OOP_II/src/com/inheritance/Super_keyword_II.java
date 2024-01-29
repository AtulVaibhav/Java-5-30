package com.inheritance;

class Base{
	int a = 100;
}
class Derived extends Base{
	int a = 200;
	public void display(){
	  int a = 300;
	  System.out.println(a);
	  System.out.println(this.a);
	  System.out.println(super.a);
	}
}
public class Super_keyword_II {

	public static void main(String[] args) {
		Derived derived = new Derived();
		derived.display();
	}

}
