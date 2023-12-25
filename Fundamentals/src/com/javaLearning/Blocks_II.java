package com.javaLearning;

public class Blocks_II {
     int data;
     static int data2;
     
     static{
    	 data2 = 200;
     }
     
     {
    	 data = 112;
     }
	public static void main(String[] args) {
	 Blocks_II b1 = new Blocks_II();
	 System.out.println(b1.data);
	 System.out.println(Blocks_II.data2);

	}

}
