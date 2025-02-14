package com.celcom.day9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	private int eid;
	private String ename;
	private int esalary;
	
	public Employee(int eid, String ename, int esalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEsalary() {
		return esalary;
	}

	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}
	
	public String toString() {
		return "Employee [eid " + eid + ", ename=" + ename + ", esalary=" + esalary + "]";
	}
	
	
}

public class SerializationExample1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee obj1 = new Employee(101, "Preet", 2000);
		
		//Serialization
		FileOutputStream fout = new FileOutputStream("D://Serialization.txt");
		ObjectOutputStream objout = new ObjectOutputStream(fout);
		objout.writeObject(obj1);
		objout.close();
		fout.close();
		System.out.println("Object Saved");
		
		//De-Serialization
		FileInputStream fin = new FileInputStream("D://Serialization.txt");
		ObjectInputStream objin = new ObjectInputStream(fin);
		Employee emp = (Employee) objin.readObject();
		objin.close();
		fin.close();
		System.out.println(emp);


	}

}
