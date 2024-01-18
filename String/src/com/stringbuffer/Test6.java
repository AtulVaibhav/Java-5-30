package com.stringbuffer;

public class Test6 {

	public static void main(String[] args) {
		/**
		 * 1.append
		 * 2.insert
		 * 3.replace
		 * 4.delete
		 * 5.reverse
		 * 6.substring
		 * 7.charAt()
		 * 
		 */
		
		StringBuffer sb = new StringBuffer("Hello");
		sb.append("Java");
		System.out.println(sb);
		
		sb.insert(1, "Python");
		System.out.println(sb);
		
		sb.replace(2,10,"JavaScript");
		System.out.println(sb);
		
		System.out.println(sb.delete(2, 10));
		
		System.out.println(sb.substring(1, 5));
		System.out.println(sb.reverse());
		System.out.println(sb.charAt(1));
		
	}

}
