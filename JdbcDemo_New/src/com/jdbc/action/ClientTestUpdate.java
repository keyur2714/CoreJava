package com.jdbc.action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ClientTestUpdate {

	public static void main(String str[]) {
		Connection connection = null;
		PreparedStatement psmt = null;
		Scanner scanner = new Scanner(System.in); 
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/core_java", "root", "admin");
			System.out.println("Connection Done...");
			System.out.print("Enter Dept Id which you want to update: ");
			int deptId = scanner.nextInt();
			System.out.print("Enter New Dept Name: ");
			String deptName = scanner.next();
			
			String sql="update department set dept_name=? where dept_id = ?";
						
			psmt = connection.prepareStatement(sql);
			psmt.setString(1, deptName);
			psmt.setInt(2, deptId);
			
			int result = psmt.executeUpdate();
			
			if(result > 0)
				System.out.println("Department Updated Successfully...!");
			else
				System.out.println("Error in updating department...!");
			
			psmt.close();
			connection.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}
