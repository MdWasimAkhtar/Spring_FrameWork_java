package com.springCore;

public class Student {
	
	private String studentId;
	private String studentName;
	private String studentAddress;
	
	
	public Student() {
		super();
	}


	public Student(String studentId, String studentName, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}


	public String getStudentId() {
		return studentId;
	}


	public void setStudentId(String studentId) {
		System.out.println("setting student"+studentId);
		this.studentId = studentId;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		System.out.println("setting student"+studentName);
		this.studentName = studentName;
	}


	public String getStudentAddress() {
		return studentAddress;
	}


	public void setStudentAddress(String studentAddress) {
		System.out.println("setting student"+studentAddress);
		this.studentAddress = studentAddress;
	}


	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ "]";
	}

	
}
