package com.celcom.day6;
import java.util.Scanner;

class InvalidAgeException extends Exception{
	int age;
	InvalidAgeException(int age){
		this.age = age;
	}
	@Override
	public String toString(){
		return age + " - Invalid Age for voting";
	}
}

public class ThrowException2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your age : ");
		int age = new Scanner(System.in).nextInt();
		
		if(age > 18) {
			System.out.println("Welcome to you");
		} else {
			try {
				throw new InvalidAgeException(age);
			} catch (InvalidAgeException e) {
				System.out.println(e);
			}
		}

	}

}
