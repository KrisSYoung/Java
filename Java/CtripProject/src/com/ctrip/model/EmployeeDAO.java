package com.ctrip.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
	public void create(Employee emp)
	{
		Connection conn = null;
		String sql = "INSERT INTO EMPLOYEET (EMPLOYEE_CODE, EMPLOYEE_NAME) VALUES (?,?)";
		PreparedStatement ps = null;
		conn = DatabaseConnection.createConnection();
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, emp.getCode());
			ps.setString(2, emp.getName());
			ps.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public List<Employee> retrieve()
	{
		List<Employee> emps=new ArrayList<Employee>();//java 1.7 之后 可以这样： List<Employee> ls=new ArrayList<>();
		String sql="SELECT * FROM EMPLOYEET";
		PreparedStatement ps=null;
		Connection conn=DatabaseConnection.createConnection();
		ResultSet rs=null;
		try {
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next())
			{
				Employee emp=new Employee();
				emp.setId(rs.getString("ID"));//如果ID为int型
				emp.setCode(rs.getString("EMPLOYEE_CODE"));
				emp.setName(rs.getString("EMPLOYEE_NAME"));
				emps.add(emp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try{
				conn.close();
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
		
		return emps;
	}
	
	public Employee retrieve(int id)
	{
		Employee emp=new Employee();
		String sql="SELECT * FROM EMPLOYEET WHERE ID=?";
		PreparedStatement ps=null;
		Connection conn=DatabaseConnection.createConnection();
		ResultSet rs=null;
		try {
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next())
			{
				
				emp.setId(rs.getString("ID"));//如果ID为int型
				emp.setCode(rs.getString("EMPLOYEE_CODE"));
				emp.setName(rs.getString("EMPLOYEE_NAME"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try{
				conn.close();
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
		
		return emp;
	}
}
