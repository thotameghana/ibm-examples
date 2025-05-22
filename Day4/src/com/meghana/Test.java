package com.meghana;

class Parent {
	void method() {
		System.out.println("Parent");
	}
}

class Test extends Parent {
	void method() {
		System.out.println("Child");
	}

	public static void main(String[] args) {
	 Parent p = new Parent();
	 Test c = (Test)p;
	 c.method();
	 }
}