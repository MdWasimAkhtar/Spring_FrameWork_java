package com.springJdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springJdbc.studentDao.StudentDao;

public class App {
	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springJdbc/springjdbc.xml");
		
/*		JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
		String query = "insert into student values(? , ? ,? )";
		
		//fire the query
        int res = template.update(query,121 , "Shilpa" , "Bangalore");
 */
		StudentDao studentD =context.getBean("st1",StudentDao.class);
		Student s1 = new Student();
		s1.setId(28);
		s1.setName("Windy");
		s1.setCity("NweYork");
		int res =  studentD.insert(s1);
        System.out.println(res+" row effected");
        
        Student s2 = new Student();
        s2.setId(100);
        s2.setName("Md Wasim Akhtar");
        int updateCount = studentD.change(s2);
        System.out.println(updateCount+" rows Updated");
        		
        		
	}
}
