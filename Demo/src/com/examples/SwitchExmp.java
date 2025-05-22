package com.examples;

public class SwitchExmp {
	public static void main(String[] args) {
//		String name="Meghana";
//		int age=21;
//		float salary=23481.3f;
//		boolean isMarried=false;
//		char genger='F';
//		
//		System.out.println("Name: "+name);
//		System.out.println("Age: "+age);
//		System.out.println("Salary: "+salary);
//		System.out.println("is Married: "+isMarried);
//		System.out.println("Gender: "+genger);
		
//		String option="16";
//		switch(option) {
//		case("1"):
//			System.out.println("have a coffee");
//			break;
//		case("2"):
//			System.out.println("have a tea");
//			break;
//		case("3"):
//			System.out.println("have a cold drink");
//			break;
//		case("4"):
//			System.out.println("have a hot water");
//			break;
//		default:
//			System.out.println("no valid option thank you");
//		}
//		
//		int[] items= {10,20,30};
//		for(int item:items) {
//			System.out.println("Item is "+item);
//		}
		
		int[] array= {1,4,3,6,2,5,0,-5};
		int max=array[0],min=array[0],sum=0;
		
		for(int i=0;i<array.length;i++) {
			if(array[i]>max) {
				max=array[i];
			}
			else if(array[i]<min) {
				min=array[i];
			}
			sum+=array[i];
		}
		
		System.out.println("Minimum is :"+min);
		System.out.println("Maximum is :"+max);
		System.out.println("Sum is :"+sum);
		boolean flag=false;
		int key=9;
		for(int item:array) {
			if(item==key) {
				flag=true;
				
				break;
			}
			
		}
		if(flag) {
			System.out.println(key+" found");
		}
		else {
			System.out.println(key+" not found");
		}
	}
}
