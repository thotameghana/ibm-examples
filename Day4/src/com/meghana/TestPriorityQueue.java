package com.meghana;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class TestPriorityQueue {
	public static void main(String[] args) {
		Queue<Integer> queue=new PriorityQueue<Integer>();
		queue.add(8);
		queue.add(1);
		queue.add(5);
		queue.add(4);
		queue.add(3);
		System.out.println(queue);
		queue.remove(3);
		System.out.println(queue);
		
		System.out.println("Peek: "+queue.peek());
		System.out.println(queue);
		queue.poll();
		System.out.println(queue);
		
		System.out.println("________________________Linked List________________________");
		Queue<Integer> q=new LinkedList<Integer>();
		q.add(8);
		q.add(1);
		q.add(5);
		q.add(4);
		q.add(3);
		System.out.println(q);
		q.remove(3);
		System.out.println(q);
		
		System.out.println("Peek: "+q.peek());
		System.out.println(q);
		q.poll();
		System.out.println(q);
	}
}
