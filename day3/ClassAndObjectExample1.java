package com.celcom.day3;

class SmartPhone{
	String company;
	int price;
	
	SmartPhone(String company, int price){
		this.company = company;
		this.price = price;
	}
	
	void display() {
		System.out.println("Company name of your Smartphone : " + company);
		System.out.println("Cost of your Smartphone : " + price);
		
	}

}

public class ClassAndObjectExample1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone obj = new SmartPhone("Apple", 60000);
		obj.display();

	}

}
