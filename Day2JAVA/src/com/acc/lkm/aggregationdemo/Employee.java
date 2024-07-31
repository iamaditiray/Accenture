package com.acc.lkm.aggregationdemo;


public class Employee {
	private String name;
	private String department;
	
	public Employee(String name) {
		this.setName(name);
		this.department=department;
	}

	private String getDepartment() {
		return department;
	}

	void setDepartment(String department) {
		this.department = department;
	}

	private String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}
	
	
}
