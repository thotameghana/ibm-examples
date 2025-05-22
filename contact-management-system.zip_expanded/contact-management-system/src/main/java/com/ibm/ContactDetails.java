package com.ibm;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="contact_details")
public class ContactDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int c_id;
	private String name;
	private long mobile_number;
	private int user_id;
	
	public ContactDetails() {
		// TODO Auto-generated constructor stub
	}

	public ContactDetails(int c_id, String name, long mobile_number, int user_id) {
		super();
		this.c_id = c_id;
		this.name = name;
		this.mobile_number = mobile_number;
		this.user_id = user_id;
	}

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobile_number() {
		return mobile_number;
	}

	public void setMobile_number(long mobile_number) {
		this.mobile_number = mobile_number;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	@Override
	public String toString() {
		return "ContactDetails [c_id=" + c_id + ", name=" + name + ", mobile_number=" + mobile_number + ", user_id="
				+ user_id + "]";
	}
	
}
