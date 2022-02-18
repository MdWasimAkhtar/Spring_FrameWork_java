package com.springJdbc.studentDao;

import com.springJdbc.Student;

public interface StudentDao {
	
	public int insert(Student student);
	public int change(Student student);

}
