package com.java.spring.ci.map;

import java.util.Map;

public class Question {

	private int id;
	private String name;
	private Map<String,String> map;
		
	public Question(int id, String name, Map<String, String> map) {
		super();
		this.id = id;
		this.name = name;
		this.map = map;
	}
	
	public void display()
	{
		System.out.println("Id : "+id);
		System.out.println("Question --> "+name);
		
		for(Map.Entry<String,String> entry : map.entrySet())
		{
		  System.out.println("Answer : "+entry.getKey()+" @"+entry.getValue());
		}
	}	
}
