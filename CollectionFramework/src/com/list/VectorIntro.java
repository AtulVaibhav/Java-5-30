package com.list;

import java.util.Iterator;
import java.util.Vector;

public class VectorIntro {

	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<>();
		
		//Adding the elements:
		for(int i=1;i<=5;i++){
			vector.add(i*i);
		}
		System.out.println(vector);
		
		//Accessing element for given index
		System.out.println("Accessing elements:");
		System.out.println(vector.get(1));
		
		//Traversal
		System.out.println("Traversing vector:");
		Iterator<Integer> itr = vector.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		//update the existing element at give index position
		System.out.println("Updating the existing value");
		vector.set(4, 30);
		System.out.println(vector);
		
		//Removing elements:
		System.out.println("Removing the elements");
		  vector.remove(1);
		  System.out.println(vector);
		
		
		

	}

}
