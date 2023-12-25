package com.javaLearning;
/**
 * local variable
 *
 */
public class Variable_III {
	int b;//instance
   public void m1(){
	   b = 100;
	   int a = 10;//local variable
	   System.out.println(a);
   }
	public static void main(String[] args) {
	new Variable_III().m1();

	}

}
