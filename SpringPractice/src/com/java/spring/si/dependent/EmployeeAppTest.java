package com.java.spring.si.dependent;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeAppTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Employee emp = context.getBean("employeebean",Employee.class);
		System.out.println(emp);
	}

}
