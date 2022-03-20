package com.designpattern.builder;

public class EmployeeObjectBuilder {
	
	private int empId;
	private String name;
	private String department;
	private String designation;
	private double experience;
	
	public EmployeeObjectBuilder setEmpId(int empId) {
		this.empId = empId;
		return this;
	}
	public EmployeeObjectBuilder setName(String name) {
		this.name = name;
		return this;
	}
	public EmployeeObjectBuilder setDepartment(String department) {
		this.department = department;
		return this;
	}
	public EmployeeObjectBuilder setDesignation(String designation) {
		this.designation = designation;
		return this;
	}
	public EmployeeObjectBuilder setExperience(double experience) {
		this.experience = experience;
		return this;
	}
	
	public Employee getEmployee() {
		return new Employee(empId, name, department, designation, experience);
	}

}
