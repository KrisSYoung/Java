package com.ctrip.service;

import java.util.List;

import com.ctrip.model.Employee;
import com.ctrip.model.EmployeeDAO;

public class EmployeeService implements IEmployeeService {

	private EmployeeDAO dao= new EmployeeDAO();
	@Override
	public void addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		dao.create(emp);
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return dao.retrieve();
	}

	@Override
	public Employee getEmployee(int id) {
		// TODO Auto-generated method stub
		return dao.retrieve(id);
		
	}

	@Override
	public void udateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployee(Employee emp) {
		// TODO Auto-generated method stub

	}

}
