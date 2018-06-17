package com.jdbc.action;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.jdbc.object.DepartmentObject;
public class ClientTestSearch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		Connection connection = null;		
		PreparedStatement psmt = null;
		List<DepartmentObject> deptList = new ArrayList<DepartmentObject>();
		DepartmentObject departmentObject = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/core_java", "root", "admin");
			System.out.println("Connection Done...");
			
			System.out.print("Enter String for Search Department: ");
			String deptSearchString = scanner.next();
			
			String sql = "select * from department where dept_name like ?";
			psmt = connection.prepareStatement(sql);
			psmt.setString(1, deptSearchString);
			
			ResultSet resultSet= psmt.executeQuery();
			
			while(resultSet.next()) {
				departmentObject = new DepartmentObject();
				departmentObject.setDeptId(resultSet.getInt(1));
				departmentObject.setDeptName(resultSet.getString(2));
//				System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2));
				deptList.add(departmentObject);
			}
			
			resultSet.close();
			psmt.close();
			connection.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println("...Department List...");
		deptList.stream().forEach(
				(dept)->{
					System.out.println(dept.getDeptId()+" "+dept.getDeptName());
				}
		);

	}

	
}
