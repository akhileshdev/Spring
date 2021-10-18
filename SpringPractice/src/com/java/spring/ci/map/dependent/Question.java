package com.java.spring.ci.map.dependent;

import java.util.Map;

public class Question {

	private int id;
	private String name;
	private Map<String,User> map;
	
	public Question(int id, String name, Map<String, User> map) {
		super();
		this.id = id;
		this.name = name;
		this.map = map;
	}
	
	public void display()
	{
		System.out.println("Id : "+id);
		System.out.println("Question --> "+name);
		
		for(Map.Entry<String,User> entry : map.entrySet())
		{
			System.out.println("Answer : "+entry.getKey());
			
			User user = entry.getValue();
			System.out.println("Posted By : "+user);			
		}
	}
	
	
}
