package com.list;

import java.util.ArrayList;
import java.util.List;

public class arrayListIntro {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		//Insert object:
		
		list.add(1);
		list.add(5);
		list.add(3);
		System.out.println(list);
		
		//Accessing element from list
		System.out.println(list.get(1));
		
		//Traverse list:
		for(int i=0;i<list.size();i++){
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		
		//update
		list.set(1,25);
		System.out.println(list);
		
		//delete
		list.remove(2);
		System.out.println(list);
		
		
		//contains
		System.out.println(list.contains(25));
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(11);
		list2.add(12);
		list2.add(13);
		
		list.addAll(list2);
		System.out.println(list);
		
		
	}

}
