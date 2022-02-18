package com.springCore.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ob")
public class Student {
	
	@Value("Shilpa")
	private String studentName;
	
	@Value("Delhi")
	private String city;
	
	public Student() {
		super();
	}

	public Student(String studentName, String city) {
		super();
		this.studentName = studentName;
		this.city = city;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + "]";
	}

	
}
