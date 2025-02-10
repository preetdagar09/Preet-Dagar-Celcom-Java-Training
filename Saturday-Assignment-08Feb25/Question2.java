package com.celcom.javaassignment2;

class Dog{
	String name;
	String breed;
	
	Dog(String name, String breed){
		this.name = name;
		this.breed = breed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}


}

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog obj1 = new Dog("John","Pitbull");
		System.out.println(obj1.getName());
		obj1.setName("Gaby");
		System.out.println(obj1.getName());
		Dog obj2 = new Dog("Jackie","lebra");
		System.out.println(obj2.getName());

	}

}
