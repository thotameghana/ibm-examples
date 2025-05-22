package com.meghana;

import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {
	public static void main(String[] args) {
		Set<String> set=new TreeSet<>();
		set.add("hii");
		set.add("hello");
		set.add("welcome");
		set.add("java");
		set.add("morning");
		
		System.out.println(set);
		set.remove("morning");
		System.out.println(set);
	}
}
