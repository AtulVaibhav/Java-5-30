package com.exceptionHandling;

public class FinallyWithReturn {
    public static int m1(){
    	try{
    		int a  =10/0;
    		return a;
    	}catch(Exception e){
    		return -1;
    	}finally{
    		return 2;
    	}
    }
	public static void main(String[] args) {
		System.out.println(m1());

	}

}
