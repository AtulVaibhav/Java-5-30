package com.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class Problems {
    public static void reverse(String str){
    	String reversedString = "";
    	for(int i=str.length()-1;i>=0;i--){
    		reversedString = reversedString+ str.charAt(i);
    	}
    	System.out.println(reversedString);
    }
    
    public static void removeDuplicates(String str){
      Map<Character,Integer> map = new LinkedHashMap<>();
      for(int i=0;i<str.length();i++){
    	  if(!map.containsKey(str.charAt(i))){
    		  map.put(str.charAt(i), map.getOrDefault(str.charAt(i),1));
    	  }else{
    		  map.put(str.charAt(i), map.get(str.charAt(i))+1);
    	  }
      }
      for(Map.Entry<Character,Integer> entry:map.entrySet()){
    	  if(entry.getValue()==1){
    		  System.out.print(entry.getKey());
    	  }
      }
      
    }
    
    
    
	public static void main(String[] args) {
		/**1.Wap to reverse a string.
		 * input:"Java" output:"avaJ"
		 * 
		 * 2.WAP to revese a word in same position
		 * input:"Java is a programming language"
		 * output:"avaJ si a gnimmargorp egaugnal
		 * 
		 * 3.WAP to find first non-repeating character
		 *  input:"hehllo" output:e
		 *  
		 * 4.WAP to print string without duplicates
		 * input:"hello" output:heo
		**/
		
		String str = "hello";
		//reverse(str);
		removeDuplicates(str);
	}

}
