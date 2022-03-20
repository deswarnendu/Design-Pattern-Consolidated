package com.designpattern.builder;

public class Employee {
	
	private int empId;
	private String name;
	private String department;
	private String designation;
	private double experience;
	
	public Employee(int empId, String name, String department, String designation, double experience) {
		this.empId = empId;
		this.name = name;
		this.department = department;
		this.designation = designation;
		this.experience = experience;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", department=" + department + ", designation="
				+ designation + ", experience=" + experience + "]";
	}
	
	

}
