package com.ctrip.service;

import java.util.List;

import com.ctrip.model.Employee;

public interface IEmployeeService {
	
	/**
	 * Comments
	 * @return
	 */
	public void addEmployee(Employee emp);
	
	public List<Employee> getEmployees();
	
	public Employee getEmployee(int id);
	
	public void udateEmployee(Employee emp);
	
	public void deleteEmployee(Employee emp);
}
