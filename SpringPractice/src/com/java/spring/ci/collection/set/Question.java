package com.java.spring.ci.collection.set;

import java.util.List;
import java.util.Set;

public class Question {

	private int id;
	private String name;
		
	private Set<String> answers;
	
	public Question(int id, String name, Set<String> answers) {
		super();
		this.id = id;
		this.name = name;
		this.answers = answers;
	}	
	
	public void display()
	{
		System.out.println("Question ID :"+id);
		System.out.println("Question --> "+name);
		
		for(String str : answers)
		{
			System.out.println(str);
		}
	}
	
}
