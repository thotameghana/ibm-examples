package com.ibm;

import java.util.List;

public class Locations {
	private List<String> cities;
	public Locations() {
		System.out.println("Locations() object is created");
	}
	
	public Locations(List<String> cities) {
		super();
		System.out.println("Locations(List<String>).............");
		this.cities = cities;
	}

	public List<String> getCities() {
		return cities;
	}
	public void setCities(List<String> cities) {
		this.cities = cities;
	}
}
