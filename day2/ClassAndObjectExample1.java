package com.celcom.day2;

class Employee{
	int eid;
	String ename;
	double esalary;
	
	//Constructor
	Employee(int id, String name, double salary) {
		eid = id;
		ename = name;
		esalary = salary;
	}
	
	//Method Declaration
	void display() {

		System.out.println("Employee Id : " + eid);
		System.out.println("Employee Name : " + ename);
		System.out.println("Employee Salary : " + esalary);
	}
}

public class ClassAndObjectExample1 {

	public static void main(String[] args) {
		Employee preet = new Employee(101, "preet", 2000);
		preet.display();

	}

}
