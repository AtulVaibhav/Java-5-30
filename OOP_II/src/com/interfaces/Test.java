package com.interfaces;
//variables inside interface : public ,static & final
interface A{
	int data=100;
}
public class Test {

	public static void main(String[] args) {
		System.out.println(A.data);
		//A.data = 200;
	}

}
