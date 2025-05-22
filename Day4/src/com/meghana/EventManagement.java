package com.meghana;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class EventManagement {
	static void printEvents(Collection<Event> collection) {
		System.out.println("Here is the event Details");
		Iterator<Event> itr = collection.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	static void deleteEvent(Collection<Event> collection,int eventId) {
		Iterator<Event> itr3 = collection.iterator();
		while(itr3.hasNext()) {
			Event e=itr3.next();
			if(e.getEventId()==eventId) {
				itr3.remove();
			}
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//lambda expression
		Comparator<Event> compareNameDesc=(o1,o2)-> o2.getEventName().compareTo(o1.getEventName());
		
		
		Comparator<Event> compareEndDateAsc=new Comparator<Event>() {
			@Override
			public int compare(Event o1, Event o2) {
				return o1.getEndDate().compareTo(o2.getEndDate());
			};
		};
		
		Comparator<Event> compareNameAsc=new Comparator<Event>() {
			
			@Override
			public int compare(Event o1, Event o2) {
				return o1.getEventName().compareTo(o2.getEventName());
			}
		};
		Set<Event> events=new TreeSet<>(compareNameDesc);
		
		events.add(new Event(1, "Birthday", LocalDate.parse("2025-01-23"),  LocalDate.parse("2025-01-24")));
		events.add(new Event(2, "Marriage", LocalDate.parse("2026-08-24"), LocalDate.parse("2026-08-27")));
		events.add(new Event(3, "Team outing", LocalDate.parse("2025-08-23"), LocalDate.parse("2025-08-28")));
		events.add(new Event(4, "Annual Day", LocalDate.parse("2025-06-23"), LocalDate.parse("2025-06-15")));
		events.add(new Event(5, "Family Fun Day", LocalDate.parse("2025-04-16"), LocalDate.parse("2025-04-18")));
		
//		System.out.println(events);
		
		printEvents(events);
		
		System.out.println("Enter the Event Id:.........");
		int eventId=sc.nextInt();

		deleteEvent(events, eventId);
		
		printEvents(events);
		sc.close();
		
	}
}
