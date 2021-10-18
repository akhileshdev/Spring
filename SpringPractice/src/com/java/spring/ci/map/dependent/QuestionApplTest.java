package com.java.spring.ci.map.dependent;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuestionApplTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Question question = context.getBean("questionbean", Question.class);
		
		question.display();
	}
}
