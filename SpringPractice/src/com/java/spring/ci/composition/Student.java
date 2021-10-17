package com.java.spring.ci.composition;

public class Student {

	private int roll;
	private String name;
	private Address address;
	
	
	public Student(int roll)
	{
		this.roll = roll;
	}
	
	public Student(int roll,String name,Address address)
	{
		this.roll = roll;
		this.name = name;
		this.address = address;
	}	
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address=" + address + "]";
	}
	
	
}
