package com.meghana;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateAndTime {
	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		System.out.println(date);
		
		LocalDate dob=LocalDate.parse("2025-04-30");
		System.out.println(dob);
		
		LocalDateTime dateTime=LocalDateTime.now();
		System.out.println(dateTime);
		
	}
}
