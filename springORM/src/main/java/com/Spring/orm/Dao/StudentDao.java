package com.Spring.orm.Dao;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.Spring.orm.entities.Student;



public class StudentDao {
	
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int insert(Student student) {
		//insert , Hibernate Tenplate has method 
		
		Integer ii = (Integer) this.hibernateTemplate.save(student);
		
		return ii;
	}
	
	//get Single data
	public Student getStudent(int studentId) {
		
		Student stud = this.hibernateTemplate.get(Student.class, studentId);
		return stud;
	}
	
	//get all data
	public List<Student> getAll() {
		List<Student> sl = this.hibernateTemplate.loadAll(Student.class);
		return sl;
	}
	
	//deleting
	@Transactional
	public void deleteStudent(int studentId) {
	 Student stud =	this.hibernateTemplate.get(Student.class, studentId);
		this.hibernateTemplate.delete(stud);
	}
     
	//update
	@Transactional
	public void updateStudent(Student student) {
		this.hibernateTemplate.update(student);
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
}