package com.java.spring.si.list.dependent;

import java.util.List;

public class Employee {

	private int id;
	private String name;
	private List<Address> addresses;	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
	
	public List<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", \nAddresses =" + addresses + "]";
	}
	
	
}
