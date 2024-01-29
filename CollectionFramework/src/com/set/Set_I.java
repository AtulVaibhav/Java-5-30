package com.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_I {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		
		//add elements to hashSet
		set.add(10);
		set.add(2);
		set.add(5);
		set.add(20);
		set.add(50);
		set.add(20);
		set.add(null);
		
		System.out.println(set);
		
		//Traversal
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		//contains
		System.out.println(set.contains(50));
		
		//remove
		System.out.println(set.remove(10));
		
		
		
		
		
		
		
		
		
		

	}

}
