package com.Spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App 
{
    public static void main( String[] args )
    {
          ApplicationContext cont =new  ClassPathXmlApplicationContext("com/Spring/jdbc/config.xml");
          
          JdbcTemplate templ = cont.getBean("jdbcTem",JdbcTemplate.class );
          
          //
          String query="Insert into Student values(?,?,?,?)";
          
          //fire the Query
         int updatecount= templ.update(query, 102,"Wasim",72,"Yes");
         System.out.println("Number of rows Effected : "+updatecount);
    }
}
