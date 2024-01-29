package com.abstraction;

 abstract class Account{
	public abstract void fteSalary();//abstract method
	//concrete method
	public void companyName(){
		System.out.println("ABC");
	}
}

 class FTE extends Account{
	 public void fteSalary(){
		System.out.println("Salary :"+30000); 
	 }
 }

public class Abstraction {

	public static void main(String[] args) {
		//Account account = new Account();
		FTE fte = new FTE();
		fte.companyName();
		fte.fteSalary();
	}

}
