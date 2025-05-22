package com.meghana;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "Hii");
		map.put(1, "Hii");
		map.put(100, "welcome");
		map.put(3, "to");
		map.put(4, "Java");
		System.out.println(map);
	}
}
