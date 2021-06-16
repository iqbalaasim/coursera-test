package com.assignment.constructor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	@Value("Mirganj")
	private String city;
	@Value("Bihar")
	private String state;
	@Value("India")
	private String country;
	@Value("123A")
	private String street;
	@Value("345672")
	private String zip;
	public Address(String city, String state, String country, String street, String zip) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
		this.street = street;
		this.zip = zip;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public String getCountry() {
		return country;
	}
	public String getStreet() {
		return street;
	}
	public String getZip() {
		return zip;
	}
	
	

}