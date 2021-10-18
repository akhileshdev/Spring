package com.java.spring.ci.collection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class QuestionApplTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Resource resource = new ClassPathResource("applicationContext.xml");
//		BeanFactory factory = new XmlBeanFactory(resource);
		
		
		 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	       Question question = context.getBean("questionbean", Question.class);  
	      // s.show();
		
		
//		Question question = (Question)factory.getBean("questionbean");
		
//		System.out.println(question);	
		
		question.display();
	}

}
