package com.designpattern.builder;

public class BuilderDemo {

	public static void main(String[] args) {
		//Using legacy approach
		Employee e = new Employee(1, "Swarnendu De", "BSCS-CAC", "Solution Architect", 12.8);
		System.out.println(e);
		
		//Using builder design pattern
		EmployeeObjectBuilder employeeObjectBuilder = new EmployeeObjectBuilder();
		employeeObjectBuilder.setDepartment("BSCS-CAC").setDesignation("Solution Architect").setName("Souvik Bhattacharyya");
		System.out.println(employeeObjectBuilder.getEmployee());
		

	}

}
