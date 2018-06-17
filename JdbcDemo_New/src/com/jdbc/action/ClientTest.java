package com.jdbc.action;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.jdbc.object.DepartmentObject;
public class ClientTest {

	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement psmt = null;
		List<DepartmentObject> deptList = new ArrayList<DepartmentObject>();
		DepartmentObject departmentObject = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/core_java", "root", "admin");
			System.out.println("Connection Done...");
			
			String sql = "select * from department";
			
			psmt = connection.prepareStatement(sql);
			
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
