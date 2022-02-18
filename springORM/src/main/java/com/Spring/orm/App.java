package com.Spring.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Spring.orm.Dao.StudentDao;
import com.Spring.orm.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext  context = new ClassPathXmlApplicationContext("ormConfig.xml");
        
        StudentDao studentDao = context.getBean("daObj", StudentDao.class);
        
        Student s1 = new Student(13,"Meridth","Glassgo");
//        s1.setStudentId(12);
//        s1.setStudentName("Shilpa kumari");
//        s1.setCity("Bangalore");
        
        int res = studentDao.insert(s1);
        System.out.println("rows Effected +"+res);
        
        
    }
}
