package com.arrays;

public class Arrays_Problem {
    public static int sumOfElements(int[] arr){
    	int sum=0;
    	for(int i=0;i<arr.length;i++){
    		sum = sum+arr[i];
    	}
    	return sum;
    }
	public static void main(String[] args) {
		int[] ar = {1,2,3,4,5,6};
        System.out.println(sumOfElements(ar));
	}

}
