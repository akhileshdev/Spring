package com.java.spring.ci.collection;

import java.util.List;

public class Question {

	private int id;
	private String name;
	private List<String> answers;	
	
	public Question(int id, String name, List<String> answers) {
		super();
		this.id = id;
		this.name = name;
		this.answers = answers;
	}
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
	public List<String> getAnswers() {
		return answers;
	}
	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}
	
//	@Override
//	public String toString() {
//		return "Question [id=" + id + ", name=" + name + ", answers=" + answers + "]";
//	}
	
	public void display()
	{
		System.out.println(id);
		System.out.println(name);
		
		for(String str : answers)
		{
			System.out.println(str);
		}
	}
	
}
