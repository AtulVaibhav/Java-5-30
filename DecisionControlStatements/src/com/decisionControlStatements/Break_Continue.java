package com.decisionControlStatements;

public class Break_Continue {
   public static void breakExample(){
	   for(int i=1;i<=10;i++){
		   if(i==6)break;
		   System.out.println(i);
	   }
   }
   public static void continueExample(){
	   for(int i=1;i<=10;i++){
		   if(i==6)continue;
		   System.out.println(i);
	   }
   }
	public static void main(String[] args) {
		breakExample();
		System.out.println("----------------------");
		continueExample();
	}

}
