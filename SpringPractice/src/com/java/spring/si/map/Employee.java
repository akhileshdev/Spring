package com.java.spring.si.map;

import java.util.HashMap;
import java.util.Map;

public class Employee {

	private int id;
	private String name;
	private Map<String,String> address = new HashMap<String,String>();
		
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
	public Map<String, String> getAddress() {
		return address;
	}
	public void setAddress(Map<String, String> address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}	
}
