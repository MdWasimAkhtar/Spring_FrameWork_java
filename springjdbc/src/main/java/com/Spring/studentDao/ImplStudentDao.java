package com.Spring.studentDao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.Spring.jdbc.Student;



public class ImplStudentDao implements StudentDao {
	
	private JdbcTemplate jdbctemplate;
	
	
	public int insert(Student student) {
		
		String query = "insert into student values(23,'Benazir', 'culcutta' )";
		int res = jdbctemplate.update(query , student.getId(),student.getName(),student.getTotal_marks());
		
		return res;
	}


	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}


	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}

	
	
}
