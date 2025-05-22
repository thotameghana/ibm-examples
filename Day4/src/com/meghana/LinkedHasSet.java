package com.meghana;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHasSet {
	public static void main(String[] args) {
		Set<Integer> set=new LinkedHashSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		System.out.println(set);
		set.remove(10);
		System.out.println(set);
	}
}
