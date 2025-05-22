package com.meghana;

import java.lang.reflect.Method;
import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {
	public static void main(String[] args) {
		Map<Integer,String> map = new TreeMap<>();
		map.put(1, "Meghana");
		map.put(2, "hii");
		map.put(4, "riya");
		map.put(5, "Arjun");
		System.out.println(map);
		
		System.out.println(map.containsValue("Arjun"));
		try {
			Class c=Class.forName("com.meghana.Event");
			Method[] methods = c.getMethods();
			for(Method method:methods) {
				System.out.println(method.getName());
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
