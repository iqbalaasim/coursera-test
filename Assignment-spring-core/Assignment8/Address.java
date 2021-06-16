package com.assignment8;

import org.springframework.stereotype.Component;

@Component
public class Address {
	
	private String street;
	private String city;
	private String state;
	private int zip;
	private String country;
	
	public String getStreet() {
		return "Park Street";
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return "Kolkata";
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return "West Bengal";
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZip() {
		return 700014;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public String getCountry() {
		return "Iraq";
	}
	public void setCountry(String country) {
		this.country = country;
	}
}
