package com.ctrip.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ctrip.model.Employee;
import com.ctrip.model.EmployeeRepository;
import com.ctrip.service.EmployeeService;
import com.ctrip.service.IEmployeeService;

/**
 * Servlet implementation class RetrieveEmployees
 */
public class RetrieveEmployees extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RetrieveEmployees() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. Get Employees list;
		//EmployeeRepository repository = new EmployeeRepository();
		//List<Employee> list = repository.getEmps();
		List<Employee> list=null;
		
		//向上转型  实现接口
		IEmployeeService employeeService=new EmployeeService();
		list=employeeService.getEmployees();
		
		
		// 2. Send the list to UI Layer.
		request.setAttribute("empsList", list);
		request.getRequestDispatcher("ShowEmployees.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
