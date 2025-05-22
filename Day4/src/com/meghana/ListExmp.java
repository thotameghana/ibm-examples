package com.meghana;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListExmp {
	public static void main(String[] args) {
		List<Integer> l=new LinkedList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(10);
		l.add(50);
		l.add(60);
		l.add(70);
		l.add(10);
		System.out.println(l);
		l.remove(0);
		System.out.println(l);
		
		Iterator<Integer> itr = l.iterator();
		while(itr.hasNext()) {
			int ele=itr.next();
			if(ele==10) {
				itr.remove();
			}
		}
		System.out.println(l);
//		l.clear();
		System.out.println(l);
		l.addFirst(1000);
		System.out.println(l);
		
		List<String> list=new ArrayList<>();
		list.add("hii");
		list.add("hello");
		list.add("welcome");
		//In case of string we can pass the data as well as the index
		list.remove("welcome");
		list.remove(0);
		System.out.println(list);
	}
}
