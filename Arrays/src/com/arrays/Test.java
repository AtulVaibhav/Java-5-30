package com.arrays;

public class Test {
	public static void sort_01(int[] arr) {
		int temp = getCount(arr);
		int[] arr2 = new int[arr.length];
		for(int i=0;i<arr.length;i++){
			if(arr[i]==0){
				arr2[i] = 0;
			}else{
				arr2[temp] = 1;
				temp = temp+1;
			}
		}
		for(int data:arr2){
			System.out.print(data+" ");
		}
		System.out.println();
	}

	private static int getCount(int[] arr) {
		int count = 0;
		for (int data : arr) {
			if(data==0) count++;
		}
		return count;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 0, 0, 1, 1, 1, 0, 1 };
		sort_01(arr);
	}

}
