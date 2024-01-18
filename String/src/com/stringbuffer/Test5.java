package com.stringbuffer;

public class Test5 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb);
		sb.append("Java");
		System.out.println(sb);
		
		StringBuffer sb2 = new StringBuffer();//16
		System.out.println(sb2.capacity());
		sb2.append("abcdefghijklmnopq");
		System.out.println(sb2.capacity());
		
		StringBuffer sb3 = new StringBuffer(30);//30
		System.out.println(sb3.capacity());
	}

}
