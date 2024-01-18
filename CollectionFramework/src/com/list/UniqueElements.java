package com.list;

import java.util.ArrayList;
import java.util.List;

public class UniqueElements {

	public static void main(String[] args) {
		int[] arr={1,1,2,3,4,3,5,6,7};
		List<Integer> list = new ArrayList<>();
		
		for(int i=0;i<arr.length;i++){
			if(!list.contains(arr[i])){
				list.add(arr[i]);
			}
		}
		
		System.out.println(list);

	}

}
