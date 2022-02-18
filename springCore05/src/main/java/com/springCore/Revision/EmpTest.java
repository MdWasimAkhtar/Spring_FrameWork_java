package com.springCore.Revision;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpTest {
	
	public static void main(String[] args) {
		
		   ApplicationContext context=   new ClassPathXmlApplicationContext("com/springCore/Revision/emp.xml");
		   
		   AutowiredEmpBean  e1=(AutowiredEmpBean)context.getBean("autowire1", AutowiredEmpBean.class);
		   System.out.println(e1);
	}

}
