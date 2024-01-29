package com.map;

import java.util.Map;
import java.util.TreeMap;

public class Map_III {

	public static void main(String[] args) {
		Map<String,Integer> map = new TreeMap<>();
		map.put("Akhil",34);
		map.put("Vivek", 23);
		map.put("Varun",25);
		
		System.out.println(map);
		
		map.put(null, 10);
		
		
		
	}

}
