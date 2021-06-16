package com.assignment.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Customer {
	
@Value("12342")
	private String customerId;
@Value("Avishek")
	private String customerName;
@Value("7986453445")
private String customerContact;
	@Autowired
	@Qualifier("address")
	private Address customerAddress;
	public Customer(String customerId, String customerName, String customerContact, Address customerAddress) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerContact = customerContact;
		this.customerAddress = customerAddress;
	}
	public String getCustomerId() {
		return customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public String getCustomerContact() {
		return customerContact;
	}
	public Address getCustomerAddress() {
		return customerAddress;
	}
	public void show() {
		System.out.println("customer Id : "+getCustomerId()+" customer Name : "+getCustomerName()+" customer Contact : "+getCustomerContact()+" customer Address :"+getCustomerAddress().getCity()+" , "+getCustomerAddress().getCountry()+", "+getCustomerAddress().getState()+", "+getCustomerAddress().getStreet()+", "+getCustomerAddress().getZip());
	}
	
}