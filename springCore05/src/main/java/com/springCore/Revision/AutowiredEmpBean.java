package com.springCore.Revision;

import org.springframework.beans.factory.annotation.Autowired;

public class AutowiredEmpBean {
	
	@Autowired
	private Emp emp;
	
	public AutowiredEmpBean() {
		super();
	}

	public AutowiredEmpBean(Emp emp) {
		super();
		this.emp = emp;
	}

	public Emp getEmp() {
		return emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "AutowiredEmpBean [emp=" + emp + "]";
	}
	
	

}
