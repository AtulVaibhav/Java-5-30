package com.arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		int[][] arr = {{21,22,23,24},{31,32},{41,42,43,44}};
//	  System.out.println(arr.length);
//	  System.out.println(arr[0].length);
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
