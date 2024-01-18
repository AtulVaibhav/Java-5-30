package com.arrays;

import java.util.Arrays;

public class Problem {
    public static void m1(int[] arr){
    	int count_of_zero = getCount(arr);
    	int temp = count_of_zero;
    	
    	for(int i=0;i<count_of_zero;i++){
    		
    			arr[i]=0;
    		
    	}
    	for(int i=count_of_zero;i<arr.length;i++){
    		arr[i]=1;
    	}
    	System.out.println(Arrays.toString(arr));
    }
    
    private static int getCount(int[] arr){
    	int count=0;
    	for(int data:arr){
    		if(data==0){
    			count++;
    		}
    	}
    	return count;
    }
	public static void main(String[] args) {
		int[] arr={0,1,0,0,1,1,0,1};
		m1(arr);

	}

}
