package com.jdbc.action;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.jdbc.object.DepartmentObject;
public class ClientTest {

	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/core_java", "root", "admin");
			System.out.println("Connection Done...");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		//Fetch Records from Database
		
		String sql= "select * from department";
		List<DepartmentObject> deptList = null;
		deptList = getRecordsFromDatabase(connection, preparedStatement, resultSet, sql);
		System.out.println("=========Before Insert==========");
		printDepartments(deptList);
		System.out.println("Insert Records in Departmens");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Dept Id");
		int deptId = scanner.nextInt();
		System.out.print("Enter DeptName");
		String deptName = scanner.next();
		
		String insertSql = "insert into department values (?,?)";
		int result = 0;
		try {
			preparedStatement = connection.prepareStatement(insertSql);
			preparedStatement.clearParameters();
			preparedStatement.setInt(1, deptId);
			preparedStatement.setString(2, deptName);
			result = preparedStatement.executeUpdate();
			if(result > 0) {
				System.out.println("Record Inserted Successfully..");
			}					
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			deptList = getRecordsFromDatabase(connection, preparedStatement, resultSet, sql);
			if(preparedStatement != null) {				
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}		
		System.out.println("=========After Insert==========");
			
		printDepartments(deptList);
	}

	private static List<DepartmentObject> getRecordsFromDatabase(Connection connection, PreparedStatement preparedStatement,
			ResultSet resultSet, String sql) {
		List<DepartmentObject> deptList=  new ArrayList<DepartmentObject>();
		DepartmentObject departmentObject;
		try {
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				departmentObject = new DepartmentObject();
				departmentObject.setDeptId(resultSet.getInt(1));
				departmentObject.setDeptName(resultSet.getString("dept_name"));
				deptList.add(departmentObject);
//				System.out.println(resultSet.getInt(1)+" "+resultSet.getString("dept_name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(resultSet != null) {				
				try {
					resultSet.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(preparedStatement != null) {				
				try {
					preparedStatement.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return deptList;
	}

	private static void printDepartments(List<DepartmentObject> deptList) {
		deptList.stream().forEach(dept->System.out.println(dept.getDeptId()+" "+dept.getDeptName()));
	}

}
