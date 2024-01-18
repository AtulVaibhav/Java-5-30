package com.stringbuffer;

public class Test7 {

	public static void main(String[] args) {
		String str = "Java";
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println(sb.toString());
	}

}
