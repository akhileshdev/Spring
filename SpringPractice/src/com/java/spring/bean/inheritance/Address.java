package com.java.spring.bean.inheritance;

public class Address {
      
	private String street;
	private String city;
	private String State;
	
	public Address(String street, String city, String state) {
		super();
		this.street = street;
		this.city = city;
		State = state;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", State=" + State + "]";
	}
   
}
