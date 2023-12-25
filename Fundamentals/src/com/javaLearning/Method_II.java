package com.javaLearning;

public class Method_II {
   int data = 100;
   static int data2 = 200;
   
   public void showData(){
	   System.out.println("Non-static methods can access static data as well as non-static data");
	   System.out.println("Instance Variable :"+data);
	   System.out.println("Static Variable :"+data2);
   }
   
   public static void display(){
	  System.out.println(data2); 
	  
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Method_II obj = new Method_II();
       obj.showData();
       Method_II.display();
	}

}
