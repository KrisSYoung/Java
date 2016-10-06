package com.ctrip.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

import com.ctrip.model.Employee;
import com.ctrip.model.EmployeeRepository;
import com.ctrip.service.EmployeeService;
import com.ctrip.service.IEmployeeService;

//@WebServlet("/AddEmployee")
public class AddEmployee extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public AddEmployee() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
         //TODO
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*
		request.setCharacterEncoding("UTF-8");
		
		String code=request.getParameter("empCode");
		String name=request.getParameter("empName");
		
		System.out.println(code+""+name);
		
		IEmployeeService employeeService=new EmployeeService();
		Employee emp=new Employee();
		emp.setCode(code);
		emp.setName(name);
		employeeService.addEmployee(emp);
		PrintWriter printWriter=response.getWriter();//response.getWriter();//页面输出设置
		printWriter.println("Submitted Successfully!");
		
		
	    
	    //response.sendRedirect("ShowEmployees.jsp");//页面跳转
	     * 
	     */
		
//		request.setCharacterEncoding("GB2312");
//		response.setCharacterEncoding("GB2312");
		String code = request.getParameter("empCode");
		String name = request.getParameter("empName");
		
		PrintWriter out = response.getWriter();
		out.println(code + " " + name);
		
		Employee emp = new Employee();
		emp.setCode(code);
		emp.setName(name);
		
		IEmployeeService service = new EmployeeService();
		service.addEmployee(emp);
		
		response.sendRedirect("../ShowEmployees");
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
