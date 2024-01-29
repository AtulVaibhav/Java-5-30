package com.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Deque_I {

	public static void main(String[] args) {
		Deque<Integer> deque = new ArrayDeque<>();
		System.out.println(deque.isEmpty());
		//Adding objects to deque
		for(int i=1;i<=5;i++){
			deque.add(i*i);
		}
		System.out.println(deque.isEmpty());
		System.out.println(deque);
		
		//add object at beginning
		deque.addFirst(100);
		System.out.println(deque);
		
		//add object at the end
		
		deque.addLast(2000);
		System.out.println(deque);
		
		//accessing object from the front-end
		System.out.println(deque.peekFirst());
		System.out.println(deque.peek());
		
		//accessing object from rear-end
		System.out.println(deque.peekLast());
		
		
		//Traversing
		Iterator<Integer> itr = deque.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		//remove
		//removing head element
		System.out.println(deque.pollFirst());
		System.out.println(deque);
		
		//removeing last element
		System.out.println(deque.pollLast());
		System.out.println(deque);
		
		

	}

}
