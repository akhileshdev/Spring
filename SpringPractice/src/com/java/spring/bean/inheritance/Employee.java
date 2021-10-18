package com.java.spring.bean.inheritance;

public class Employee {

	private int id;
	private String name;
	private Address address;
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public void display()
	{
		System.out.println("Id :"+id);
		System.out.println("Name :"+name);		
		System.out.println(address);
	}
	
	
}
