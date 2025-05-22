package com.oops;

interface Vehicle{
	void mileage();
	void wheels();
}
abstract class Bike implements Vehicle{
	@Override
	public void wheels() {
		System.out.println("2 wheeler");
	}
}
class Rx extends Bike{

	@Override
	public void mileage() {
		System.out.println("Rx 100 mileage is: 34kmpl");
	}
}
class RoyalEnfield extends Bike{

	@Override
	public void mileage() {
		System.out.println("Royal Enfield mileage is: 25kmpl");
	}	
}
abstract class Car implements Vehicle{
	@Override
	public void wheels() {
		System.out.println("4 wheeler");		
	}
}
class BMW extends Car{

	@Override
	public void mileage() {
		System.out.println("BMW mileage is: 15kmpl");
	}
	
}
class I10 extends Car{
	@Override
	public void mileage() {
		System.out.println("I10 mileage is: 10kmpl");
	}
}
public class Demo {
	static void print(Vehicle veh) {
		veh.mileage();
		veh.wheels();
		System.out.println("____________________________________");
	}
	public static void main(String[] args) {
		Vehicle b1=new RoyalEnfield();
		Vehicle b2=new Rx();
		
		Vehicle c1=new BMW();
		Vehicle c2=new I10();
		
		print(b1);
		print(b2);
		print(c1);
		print(c2);
	}
}

//abstract class Bike implements Vehicle{
//private String mileage;
//private int wheels;
//String name;
//public abstract void name();
//public Bike(String name,String mileage, int wheels) {
//	this.mileage=mileage;
//	this.wheels=wheels;
//}
//@Override
//public void mileage() {
//	System.out.println("Mileage: "+mileage);
//	
//}
//@Override
//public void wheels() {
//	System.out.println("Wheels: "+wheels);
//	
//}
//
//}
//class RoyalEnfield extends Bike{
//
//public RoyalEnfield(String name,String mileage, int wheels) {
//	super(name,mileage, wheels);
//}
//public void print(Vehicle v) {
//	v.mileage();
//	v.wheels();
//}
//@Override
//public void name() {
//	System.out.println(name);
//}
//}
//class Rx100 extends Bike{
//
//public Rx100(String name,String mileage, int wheels) {
//	super(name,mileage, wheels);
//}
//
//@Override
//public void name() {
//	System.out.println(name);
//}
//}

