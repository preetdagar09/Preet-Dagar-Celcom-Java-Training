package com.celcom.day12;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
	

class Employee {
	//Initializing employee
	String empID;
	String empName;
	String empEmail;
	String empAge;
	
	Employee(String empID, String empName, String empEmail, String empAge){
		this.empID = empID;
		this.empName = empName;
		this.empEmail = empEmail;
		this.empAge = empAge;
	}
	
	//Storing them in a HashMap
	static Map<String, String> employeeMap = new HashMap<>();
	static Connection conn;
	static {
		//Creating and connecting Database
		String url = "jdbc:mysql://localhost:3306/EmployeeDB";
		String username = "root";
		String password = "Celcom123#";
		
		
		try {
			conn = DriverManager.getConnection(url, username, password);
			String query1 = "create table if not exists Employees("+" EmployeeID VARCHAR(20) PRIMARY KEY,"+" EmployeeName VARCHAR(50),"+" EmployeeMail VARCHAR(50),"+" EmployeeAge VARCHAR(20))";
			
			Statement st = conn.createStatement();
			st.executeUpdate(query1);
			
		} catch(Exception e) {
			System.out.println("Database Connection Unsuccessful");
		}
	}

	
	//Adding employee
	static void addEmployee(String empID, String empName, String empEmail, String empAge) {
		Employee employee = new Employee(empID, empName, empEmail, empAge);
		employeeMap.put(empID, empAge);
		
		try {
			String query = "Insert into Employees(EmployeeID, EmployeeName, EmployeeMail, EmployeeAge) values (?, ?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(query);  //Doubt
			pstmt.setString(1, empID);
			pstmt.setString(2, empName);
			pstmt.setString(3, empEmail);
			pstmt.setString(4, empAge);
			
			pstmt.executeUpdate();
			System.out.println("Employee added successfully.");
		} catch(SQLException e) {
			System.out.println("Cannot add employee details to the database");
			e.printStackTrace();
		}
	}
	
	
	static void removeEmployee(String empID) {
		
		employeeMap.remove(empID);
		try {
			String query = "Delete from Employees where EmployeeID = ?";
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setString(1, empID);
			pstmt.executeUpdate();
			System.out.println("Employee removed successfully");
		} catch(SQLException e) {
			System.out.println("Cannot remove employee details to the database");
			e.printStackTrace();
		}
		
	}
	
	static void viewEmployees(String EmployeeAge) {
		try {
			String query = "Select * from Employees where EmployeeAge > ?";
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setString(1, EmployeeAge);
			ResultSet rs = pstmt.executeQuery();
			
			System.out.println("Employees with age greater than " + EmployeeAge + ":");
			while(rs.next()) {
				String empID = rs.getString("EmployeeID");
				String empName = rs.getString("EmployeeName");
				String empMail = rs.getString("EmployeeMail");
				String empAge = rs.getString("EmployeeAge");
				
				System.out.println("ID: " + empID + ",Name: " + empName +",Email = " + empMail+",Age: " + empAge);
			}
		} catch(SQLException e) {
			System.out.println("Cannot display employee details from the database");
			e.printStackTrace();
		}
	}
}



public class EmployeeJDBCproblem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("Enter what you want to do : \n\n 1.Add Employee \n 2.Remove an Employee \n 3.View Employees \n 4.Exit");
	
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:
				System.out.println("Enter Employee ID: ");
				String add_EId = sc.nextLine();

				
				System.out.println("Enter Employee Name: ");
				String ename = sc.nextLine();
				
				System.out.println("Enter Employee E-Mail: ");
				String empMail = sc.nextLine();
				System.out.println("Enter Employee age : ");
				String empAge = sc.nextLine();
				Employee.addEmployee(add_EId, ename, empMail, empAge);
				break;
			
			case 2:
				System.out.println("Enter Employee ID: ");
				String remove_EId = sc.next();
				Employee.removeEmployee(remove_EId);
				break;
				
			case 3:
				System.out.println("Enter the age to view employees older than: ");
				String viewEmpAge = sc.next();
				Employee.viewEmployees(viewEmpAge);
				break;
				
			case 4:
				System.out.println("Exiting...");
				System.exit(1);
				break;
			
			default:
				System.out.println("Invalid choice , please try again.");
				
			}
		}
	}
}
