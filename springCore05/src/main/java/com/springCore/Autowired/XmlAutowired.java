package com.springCore.Autowired;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlAutowired {
	
	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springCore/Autowired/AutoConfig.xml");
		
		Emp emp1 = (Emp)context.getBean("emp1", Emp.class);
		System.out.println(emp1);
		
	}

}
