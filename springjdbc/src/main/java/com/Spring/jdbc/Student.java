package com.Spring.jdbc;

public class Student {
	
	private int id;
	private String name;
	private int total_marks;
	private String failedSubj;
	
	public Student(){
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTotal_marks() {
		return total_marks;
	}
	public void setTotal_marks(int total_marks) {
		this.total_marks = total_marks;
	}
	public String getFailedSubj() {
		return failedSubj;
	}
	public void setFailedSubj(String failedSubj) {
		this.failedSubj = failedSubj;
	}

	
	
}
