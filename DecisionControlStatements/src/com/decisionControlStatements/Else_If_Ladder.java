package com.decisionControlStatements;

public class Else_If_Ladder {
    public static void grade(int marks){
    	if(marks>=80)System.out.println("Distinction");
    	else if(marks>=60 && marks<80){
    		System.out.println("First Division");
    	}else if(marks>=40 && marks<60){
    		System.out.println("Second Division");
    	}else{
    		System.out.println("try again");
    	}
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   grade(56);
	}

}
