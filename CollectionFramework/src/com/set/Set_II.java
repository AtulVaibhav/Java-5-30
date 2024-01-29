package com.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Set_II {

	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<>();
		//adding objects to set
		set.add("Varun");
		set.add("Ravi");
		set.add("Akhil");
		set.add("Anjani");
		System.out.println(set);
		
		//duplicates not allowed
		set.add("Varun");
		System.out.println(set);
		
		//null is allowed
		set.add(null);
		System.out.println(set);
		
		//Traversal
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		//contains
		System.out.println(set.contains("Anjani"));
		
		//remove
		System.out.println(set.remove("Anjani"));
		
		
		

	}

}
