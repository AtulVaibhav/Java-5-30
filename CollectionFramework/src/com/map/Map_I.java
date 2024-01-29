package com.map;

import java.util.HashMap;
import java.util.Map;

public class Map_I {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("Vivek", 23);
		map.put("Akhil",34);
		map.put("Varun",25);
		
		System.out.println(map);
       
		//checking duplicate key
		map.put("Akhil",37);
		System.out.println(map);
		
		//check null as key
		map.put(null, 36);
		System.out.println(map);
		
		//get(key)
		System.out.println(map.get("Vivek"));
		
		
		//Traversal
		for(Map.Entry<String, Integer> entry:map.entrySet()){
			//print all possible key-value
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		for(Map.Entry<String, Integer> entry:map.entrySet()){
			//print all possible key
			System.out.println(entry.getKey());
		}
		
		for(Map.Entry<String, Integer> entry:map.entrySet()){
			//print all possible value
			System.out.println(entry.getValue());
		}
		
		
		
	}

}
