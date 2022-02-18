package com.Spring.jdbc.Dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.Spring.jdbc.Student;

public class StudentDaoImplement implements StudentDao{
	
	private JdbcTemplate jdbctemplate;
	
	public int insert(Student student) {
		
		String query="insert into Student values(? , ? , ? , ?)";
		
		int updatecount = this.jdbctemplate.update(query , student.getId(), student.getName(),student.getTotal_marks(),student.getFailedSubj());
		return updatecount;
	}
	
	public int change(Student student) {
		//updating data
		
		String query = "update Student set total_marks = ? , failedSubject = ? where id= ?  ";
		
		int updateCount = this.jdbctemplate.update(query, student.getTotal_marks(),student.getFailedSubj(),student.getId()) ;
		
		return updateCount;
	}
	
	public int delete(int studentId) {
		
		String query = "Delete from Student where id = ? ";
		int updatecount= this.jdbctemplate.update(query , studentId);
		return updatecount;
	}
	
	public Student getStudent(int studentId) {
		//select Single data
		String query = "Select * from Student where id = ? ";
		  RowMapper<Student>  rowMapper = new  RowMapperImpl();
		   Student st =  this.jdbctemplate.queryForObject(query, rowMapper , studentId);
		  return st;
	}

	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}
	
	
}
