package com.ctrip.model;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
	private List<Employee> emps;
	
	public EmployeeRepository() {
		emps = new ArrayList<Employee>();
		initialize();
	}
	
	public void initialize() {
		Employee emp1 = new Employee();
		emp1.setCode("001");
		emp1.setId("1");
		emp1.setName("Jacky");
		
		Employee emp2 = new Employee();
		emp2.setCode("002");
		emp2.setId("2");
		emp2.setName("Lucy");
		
		emps.add(emp1);
		emps.add(emp2);
	}

	public List<Employee> getEmps() {
		return emps;
	}
	
}
