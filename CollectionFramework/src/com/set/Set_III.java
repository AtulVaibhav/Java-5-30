package com.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Set_III {

	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>();
		//adding objects
		set.add(10);
		set.add(5);
		set.add(20);
		set.add(3);
		set.add(1);
		//set.add(null);
		System.out.println(set);
		
		//Traversal
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		//contains
		System.out.println(set.contains(20));
		
		//remove
		System.out.println(set.remove(20));
		

	}

}
