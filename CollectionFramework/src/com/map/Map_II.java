package com.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Map_II {

	public static void main(String[] args) {
		Map<String,Integer> map = new LinkedHashMap<>();
		map.put("Akhil",34);
		map.put("Vivek", 23);
		map.put("Varun",25);
		
		System.out.println(map);
		map.put(null, 12);
		System.out.println(map);

	}

}
