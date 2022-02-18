package com.springCore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StereotypeTestAnnotation {
	
	public static void main(String[] args) {
		ApplicationContext context= new  ClassPathXmlApplicationContext("com/springCore/stereotype/stereotype.xml");
		
          Student s1 = (Student)context.getBean("ob", Student.class);
          System.out.println(s1);
		
		
		
	}

}
