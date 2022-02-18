package com.Spring.jdbc.Dao;

import com.Spring.jdbc.Student;

public interface StudentDao {
	
	public int insert(Student student) ;
	
	public int  change(Student student);
	
	public int delete(int studentId);
	
	public Student getStudent(int studentId);

}
