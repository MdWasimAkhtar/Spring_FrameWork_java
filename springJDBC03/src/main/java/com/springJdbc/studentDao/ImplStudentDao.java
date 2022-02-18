package com.springJdbc.studentDao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.springJdbc.Student;

public class ImplStudentDao implements StudentDao {
	
	private JdbcTemplate jdbctemplate;
	
	

	public int insert(Student student) {
		
		String query = "insert into student value(?,?,?) ";
		int updateCount = this.jdbctemplate.update(query ,student.getId(),student.getName(), student.getCity());
		
		return updateCount;
	}

	public int change(Student student) {
		
		String query = "update student set name=? where id=?   ";
	    int updatecount =this.jdbctemplate.update(query ,student.getName(),student.getId());
		
		return updatecount;
	}


	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}



	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}
}
