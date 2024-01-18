package com.list;

import java.util.LinkedList;

public class LinkedListIntro {
   public static void printLinkedList(LinkedList<Integer> linkedList)
   {
	 //Traverse the linkedList
	 		System.out.print("head ->");
	 		for(int i=0;i<linkedList.size();i++)
	 		{
	 			System.out.print(linkedList.get(i)+" ->");
	 		}
	 		System.out.println("null");
	 			
   }
   
   
   
   public static void main(String[] args) {
		//creating linkedList
		LinkedList<Integer> linkedList = new LinkedList<>();
		
		//check if any element is present or not
		System.out.println(linkedList.isEmpty());
		
		//adding elements to linkedlist
		linkedList.add(12);
		linkedList.add(9);
		linkedList.add(14);
		linkedList.add(20);
		linkedList.add(25);
		
		printLinkedList(linkedList);
		//adding element at the beginning position:
		System.out.println("Adding element at the beginning:");
		linkedList.addFirst(100);
		
		printLinkedList(linkedList);
		
		//adding element at given index
		System.out.println("Adding element at given position");
		linkedList.add(3, 500);
		
		printLinkedList(linkedList);
		
		//adding element at end position
		System.out.println("Adding element at end position");
		linkedList.addLast(1001);
		printLinkedList(linkedList);
		
		//Accessing first element
		System.out.println("Accessing first element");
		System.out.println("Head element :"+linkedList.peekFirst());
		
		//Accessing the element at given position
		System.out.println("Accessing element at given position");
		System.out.println(linkedList.get(1));
		
		//Accessing end element
		System.out.println("Accessing end element");
		System.out.println(linkedList.peekLast());
		
		//updating existing element
		System.out.println("Updating existing element");
		linkedList.set(3,800 );
		printLinkedList(linkedList);
		
		
		//removing element at beginning
		System.out.println("Removing first element");
		linkedList.pollFirst();
		printLinkedList(linkedList);
		
		//removing element at given position
		System.out.println("Removing element at given position");
		linkedList.remove(2);
		printLinkedList(linkedList);
		
		//removing from end position
		System.out.println("Removing element at end position");
		linkedList.pollLast();
		printLinkedList(linkedList);
		
		
		
	}

}
