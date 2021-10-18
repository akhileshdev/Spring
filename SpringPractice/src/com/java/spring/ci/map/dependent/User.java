package com.java.spring.ci.map.dependent;

public class User {

	private int id;
	private String userName;
	private String userEmail;
	
	public User(int id, String userName, String userEmail) {
		super();
		this.id = id;
		this.userName = userName;
		this.userEmail = userEmail;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", userEmail=" + userEmail + "]";
	}
	
	
}
