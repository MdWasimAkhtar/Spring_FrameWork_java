package com.Spring.jdbc.Dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Spring.jdbc.Student;

public class TestDao {
	
	public static void main(String[] args) {
		
		ApplicationContext cont = new ClassPathXmlApplicationContext(
				"com/Spring/jdbc/Dao/JdbcDaoConfig.xml");
		
		StudentDao SDao =  cont.getBean("studentDao", StudentDao.class);
//		
//		Student s1 = new Student();
//		s1.setId(99);;
//		s1.setName("Rekha");
//		s1.setTotal_marks(100);
//		s1.setFailedSubj("NO");
//				
//		int updateCount=SDao.insert(s1);
//		System.out.println("Student added  :"+updateCount);
//		
//		Student s2 = new Student();
//		s2.setId(99);
//		s2.setTotal_marks(72);
//		s2.setFailedSubj("yes");
//		
//		int update = SDao.change(s2);
//	    System.out.println(update);

		
//		Student s3 = new Student();
//		s3.setId(65);
//		s3.setName("Shital Kumari");
//		s3.setTotal_marks(72);
//		s3.setFailedSubj("One Subject failed");
//		
//		int update = SDao.insert(s3);
//		System.out.println(update);

		//Delete
//		int res = SDao.delete(123);
//	    System.out.println(res);
	    
	    //retrive
		Student st = SDao.getStudent(101);
		System.out.println(st);
		
	    
		
	}

}
