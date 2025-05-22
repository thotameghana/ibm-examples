package com.ibm;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class TicketBooking implements Runnable{
	int ticketCounter=1;
	@Override
	synchronized public void run() {
		String name=Thread.currentThread().getName();
		if(ticketCounter!=0) {
			System.out.println(name+" booked the ticket");
			ticketCounter--;
		}
		else {
			System.err.println(name+" ticket is unavailable");
		}
	}
}
public class SynchronizationExmp {
	public static void main(String[] args) {
		//Threads are not reusable when we 
		TicketBooking t=new TicketBooking();
//		new Thread(t, "Meghana").start();
//		new Thread(t,"deepthi").start();
//		new Thread(t,"riya").start();
		
		//for reusing threads we have to use Executor
		ExecutorService exe=Executors.newFixedThreadPool(3);
		for(int i=0;i<=10;i++) {
			exe.execute(t);
		}
		exe.shutdown();
	}
}
