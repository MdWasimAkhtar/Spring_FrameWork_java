package com.springCore.Revision;



public class Emp {
	
	private int empId;
	private String empName;
	private Long empSal;
	
	public Emp() {
		super();
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Long getEmpSal() {
		return empSal;
	}

	public void setEmpSal(Long empSal) {
		this.empSal = empSal;
	}

	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}

	
	
}
