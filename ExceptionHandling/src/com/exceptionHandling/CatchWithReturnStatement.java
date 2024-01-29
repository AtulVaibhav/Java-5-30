package com.exceptionHandling;

public class CatchWithReturnStatement {
    public static int m1(){
    	try{
    		int a = 10;
    		System.out.println(a/0);
    		return 2;
    	}catch(Exception e){
    		return -1;
    	}
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int result = CatchWithReturnStatement.m1();
       System.out.println(result);
	}

}
