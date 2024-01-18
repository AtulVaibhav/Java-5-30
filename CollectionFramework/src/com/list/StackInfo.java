package com.list;

import java.util.Stack;

public class StackInfo {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		
		//push:adding elements to stack
		stack.push("Harsh");
		stack.push("Vivek");
		stack.push("Akhil");
		stack.push("Vishal");
		
		System.out.println(stack);
		
		//printing head element
		System.out.println(stack.peek());
		
		//Accessing elements based on index:
		System.out.println(stack.get(2));
		
		
		//updating the existing elements
		stack.set(2, "Aayush");
		System.out.println(stack);
		
		//removing from top of stack
		stack.pop();
		System.out.println(stack);
		
		//removing element from given index position
		stack.remove(1);
		System.out.println(stack);
		
		
		

	}

}
