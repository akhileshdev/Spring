package com.java.spring.ci;

public class Student {
	
	private int rollno;
	private String name;
	
	
	public Student(int rollno)
	{
		this.rollno = rollno;
	}
	
	public Student(String name)
	{
		this.name = name;
	}
	
	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	
	public String toString()
	{
		return rollno+" "+name;
	}

}
