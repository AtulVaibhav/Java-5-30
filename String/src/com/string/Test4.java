package com.string;

public class Test4 {

	public static void main(String[] args) {
		//length()
		String str = "Java";
		System.out.println(str.length());
		
		//toUpperCase
		System.out.println(str.toUpperCase());
		
		//toLowerCase
		System.out.println(str.toLowerCase());
		
		//concat
		String str2 = "World";
		System.out.println(str.concat(str2));
		
		//indexof(char)
		System.out.println(str2.indexOf('W'));
		
		//charAt(index)
		System.out.println(str2.charAt(1));
		
		//substring(beginIndex,endIndex)
		String str3 = "encyclopedia";
		System.out.println(str3.substring(1,4));
		
		//split(reg):String[]
		String str4 = "Java-is-a-language";
		String[] arr = str4.split("-");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
	}

}
