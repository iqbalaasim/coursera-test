package com.assignment8;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer implements InitializingBean,DisposableBean{
	private int customerId;
	private String customerName;
	private double customerContact;
	@Autowired
	private Address customerAddress;
	
	public int getCustomerId() {
		return 001;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return "Aasim";
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getCustomerContact() {
		return 703040404;
	}
	public void setCustomerContact(double customerContact) {
		this.customerContact = customerContact;
	}
	public Address getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}
	
	public void customerDetails()
	{
		System.out.println("Customer ID is =" + getCustomerId());
		System.out.println("Customer Name is =" + getCustomerName());
		System.out.println("Customer Contact Number is =" + getCustomerContact());
		System.out.println("Address of the Customer is =" + getCustomerAddress().getCity()+ " " + getCustomerAddress().getCountry()+ " " + getCustomerAddress().getZip() +" " +getCustomerAddress().getState() + " " +getCustomerAddress().getStreet());
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing method called for triangle");
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("Disposable Destroy method called for Triangle");
		
	} 
}
