package com.examples;

import java.util.ArrayList;

class Parent {
    void display() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
	@Override
    void display() {
        System.out.println("Child");
    }
}

public class HelloWorld {
	 public static void main(String[] args) {
		 Thread t = new Thread(() -> System.out.println("Thread executed"));
	        t.start();
	        t.run();
	 }
}
