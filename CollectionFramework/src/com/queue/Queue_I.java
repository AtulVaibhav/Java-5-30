package com.queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_I {

	public static void main(String[] args) {
		Queue<Integer> queue = new PriorityQueue<>();
		
//		System.out.println(queue.poll());
		
		//adding elements:
		queue.add(10);
		queue.add(5);
		queue.add(7);
		queue.add(12);
		
		System.out.println(queue);
		
		//head element
		System.out.println("Head element :"+queue.peek());
		
		//removing head element
		System.out.println("Removing head element :"+queue.poll());
		
		//next head element
		System.out.println(queue.peek());
		
	    //Traversal
		Iterator<Integer> itr = queue.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		
		
	}

}
