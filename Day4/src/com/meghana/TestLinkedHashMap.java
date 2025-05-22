package com.meghana;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestLinkedHashMap {
	public static void main(String[] args) {
		Map<Integer,String> map=new LinkedHashMap<>();
		map.put(1, "Hii");
		map.put(2, "welcome");
		map.put(3, "to");
		map.put(4, "Java");
		
		System.out.println(map);
		
		map.remove(3);
		System.out.println(map);
		
		System.out.println(map.get(4));
	}
}
