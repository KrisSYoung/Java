package com.ctrip.model;

import java.sql.Connection;

public class Test {
	
	
	public static void main(String[] args) {
		//Connection conn=DatabaseConnection.createConnection();
		Employee emp = new Employee();
		emp.setCode("001");
		emp.setName("Jacky");
		
		EmployeeDAO dao = new EmployeeDAO();
		dao.create(emp);
	}
}
