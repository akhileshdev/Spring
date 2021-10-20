package com.java.spring.si.list;

import java.util.List;

public class Employee {

	private int id;
	private String name;
	private List<String> songs;
	
	
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
	public List<String> getSongs() {
		return songs;
	}
	public void setSongs(List<String> songs) {
		this.songs = songs;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", \nSongs=" + songs + "]";
	}
	
	
}
