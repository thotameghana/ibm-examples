package com.meghana;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSet {
	public static void main(String[] args) {
		Set<String> set=new HashSet<>();
		set.add("Hii");
		set.add("Hello");
		set.add("Welcome");
		set.add("Java");
		set.add("Hii");
		System.out.println(set.size());
		System.out.println(set);

		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			String ele=itr.next();
			if(ele.equals("Hello")) {
				itr.remove();
			}
		}
		System.out.println("_____After removing hello____");
		System.out.println(set);
		//we can remove data by directly passing data in remove
		set.remove("Java");
		System.out.println(set);
	}
}
