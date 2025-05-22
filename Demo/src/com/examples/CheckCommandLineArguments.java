package com.examples;

public class CheckCommandLineArguments {
	public static void main(String[] args) {
		
		int sum=0;
		for(String item: args) {
			sum+=Integer.parseInt(item);
			System.out.println(item);
		}
		System.out.println("Sum is: "+sum);
	}
}
