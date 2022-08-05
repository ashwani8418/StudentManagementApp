package com.student.manage;
import java.sql.Connection;
import java.sql.DriverManager;

public class CP {
	static Connection con;
	public static Connection createC() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Creating a connection
			String url = "jdbc:mysql://localhost:3306/student_management_app";
			String user = "root";
			String password = "XXXXXXXX";
			con = DriverManager.getConnection(url, user, password);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return con;
	}
}
