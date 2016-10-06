package com.ctrip.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	//静态代码块
	//系统优先处理静态代码块
	/*
	 * 
	 * 
	 * 
	 * */
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//
	public static Connection createConnection()
	{
		String url="jdbc:mysql://localhost:3306/ctripdb";
		Connection conn=null;
		try {
			conn=DriverManager.getConnection(url,"root","123456");
			System.out.println("Successfully Connected!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
}
