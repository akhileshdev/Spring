package com.java.spring.bean.inheritance;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanInheritanceApplTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Employee employee = context.getBean("employeebean", Employee.class);
		
		employee.display();
		
	}

}
