package com.celcom.javaassignment2;

class Person{
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
		this.show();
	}
	
	void show() {
		System.out.println(name);
		System.out.println(age);
	}
}

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person obj = new Person("Preet",21);
		//obj.show();
		Person obj2 = new Person("Ramesh",25);
		//obj2.show();
	}

}
