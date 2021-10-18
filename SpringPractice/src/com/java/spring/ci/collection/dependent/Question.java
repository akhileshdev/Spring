package com.java.spring.ci.collection.dependent;

import java.util.List;

public class Question {

	private int id;
	private String name;
		
	private List<Answer> answers;
	
	public Question(int id, String name, List<Answer> answers) {
		super();
		this.id = id;
		this.name = name;
		this.answers = answers;
	}	
	
	public void display()
	{
		System.out.println("Question ID :"+id);
		System.out.println("Question --> "+name);
		
		//System.out.println("Answer is : -");
		for(Answer ans : answers)
		{
			System.out.println(ans);
		}
	}
	
}