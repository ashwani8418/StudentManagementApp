package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDB {
	
	public static boolean insertStudentToDB(Student st) {
		//JDBC Code....
		
		boolean flag = false;
		try {
			// Create connection ....
			Connection con = CP.createC();
			String q = "insert into students(sname, sphone,scity,sage) values(?,?,?,?)";
			
			//Prepare Statement to insert into DataBase
			
			PreparedStatement  pstmt = con.prepareStatement(q);
			
			//Set the value of parameter
			
			pstmt.setString(1,st.getSname());
			pstmt.setString(2,st.getSphone());
			pstmt.setString(3,st.getScity());
			pstmt.setInt(4, st.getSage());
			
			pstmt.executeUpdate();
			flag = true;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return flag;
	}

	public static boolean deleteStudentInfo(int Studentid) {
		// TODO Auto-generated method stub
		boolean flag = false;
		try {
			Connection con = CP.createC();
			String q = "delete from students where sid = ?";
			
			//Prepare Statement to insert into DataBase
			
			PreparedStatement  pstmt = con.prepareStatement(q);
			
			//Set the value of parameter
			
			pstmt.setInt(1, Studentid);
			
			pstmt.executeUpdate();
			flag = true;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return flag;
	}

	public static void showAllData() {
		// TODO Auto-generated method stub
		try {
			Connection con = CP.createC();
			String q = "SELECT * FROM STUDENTS";
			
			//Prepare Statement to insert into DataBase
			
			Statement stmt = con.createStatement();
			
			//Set the value of parameter
			ResultSet set = stmt.executeQuery(q);
			while(set.next()) {
				int studentId = set.getInt(1);
				String studentName = set.getString(2);
				String studentPhone = set.getString(3);
				String studentCity = set.getString(4);
				int studentAge = set.getInt(5);
				
				System.out.println("ID\t\t : "+studentId);
				System.out.println("Name\t\t : "+studentName);
				System.out.println("Phone No\t : "+studentPhone);
				System.out.println("City\t\t : "+studentCity);
				System.out.println("age\t\t : "+studentAge);
				System.out.println("___________________________________________");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public static boolean updateStudentInfo(Student st) {
		// TODO Auto-generated method stub
		boolean flag = false;
		try {
			Connection con = CP.createC();
			
			String q = "UPDATE STUDENTS SET sname = ? ,sphone =?, scity = ?, sage = ? WHERE sid = ?";
			//Prepare Statement to insert into DataBase
			
			PreparedStatement  pstmt = con.prepareStatement(q);
			
			//Set the value of parameter
			
			pstmt.setString(1,st.getSname());
			pstmt.setString(2,st.getSphone());
			pstmt.setString(3,st.getScity());
			pstmt.setInt(4, st.getSage());
			pstmt.setInt(5,st.getSid());
			
			pstmt.executeUpdate();
			flag = true;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return flag;
	}

}
