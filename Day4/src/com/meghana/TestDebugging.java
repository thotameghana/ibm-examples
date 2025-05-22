package com.meghana;

import java.util.Scanner;

public class TestDebugging {
	public static void main(String[] args) {
		System.out.println("main method starts");
		int[] items = {20, 30, 10, 50, 40};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num");
		int n=sc.nextInt();
		System.out.println("N= "+n);
		int result = sum(items);
		display(result++);
	}
	public static int sum(int[] items) {
		int result = 0;
		for(int item : items) {
			result = result + item;
		}
		return result;
	}
	public static void display(int result) {
		result++;
		System.out.println("v = "+result);
	}
}
