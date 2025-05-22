package com.ibm;

class T1 extends Thread{
	
	@Override
	public void run() {
		Thread t1 = Thread.currentThread();
		System.out.println("Currently exexuting thread is: "+t1.getName());
		for(int i=1;i<=100;i++) {
			System.out.println("i= "+i);
		}
	}
}
class T2 implements Runnable{
	@Override
	public void run() {	
		Thread t = Thread.currentThread();
		System.out.println("Currently exexuting thread is: "+t.getName());
		for(int i=500;i<=600;i++) {
			System.out.println("i= "+i);
		}
	}
}
public class ThreadTest{
	public static void main(String[] args) {
		
		T1 a=new T1();
		T2 b=new T2();
		Thread t=new Thread(b);
		
		a.start();
		t.start();
		a.setName("T1");
		t.setName("T2");
		System.out.println("Main Method");
	}
}
