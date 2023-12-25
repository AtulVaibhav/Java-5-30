package com.decisionControlStatements;

public class If_Else {
    public static void isEven(int num){
    	if(num%2==0){
    		System.out.println(num+" is an even number");
    	}else{
    		System.out.println(num+" is not an even number");
    	}
    }
	public static void main(String[] args) {
		If_Else.isEven(121);
	}

}
