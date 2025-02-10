package com.celcom.javaassignment2;

class Employee{
	String name;
	String jobTitle;
	int salary;
	int finalSalary;
	int tax = 500;
	int hra = 1000;
	int pf = 1200;
	
	Employee(String name, String jobTitle, int salary){
		this.name = name;
		this.jobTitle = jobTitle;
		this.salary = salary;
		this.calculate();
		this.setSalary(finalSalary);
		this.updatedSalary();
	}
	
	void calculate(){
		System.out.println("Your salary is : "+ salary);
		finalSalary = (salary + hra + pf )-tax;
		
	}
	

	public void setSalary(int finalSalary) {
		this.salary = finalSalary;
	}
	
	void updatedSalary() {
		System.out.println("Your Updated Salary is : "+ salary);
	}
	
}

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj1 = new Employee("Preet","Trainee",10000);
		

	}

}
