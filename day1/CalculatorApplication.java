package com.celcom.day1;

import java.util.Scanner;

public class CalculatorApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		do {

			System.out.println("Enter the first number : ");
			int num1 = sc.nextInt();
			System.out.println("Enter the second number : ");
			int num2 = sc.nextInt();
			System.out.println("1 - Addition,2 - Subtraction,3 - Multiplication,4 - Division,5 - quit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Addition of " + num1 + " and " + num2 + " is " + (num1 + num2));
				break;
			case 2:
				System.out.println("Subtraction of " + num1 + " and " + num2 + " is " + (num1 - num2));
				break;
			case 3:
				System.out.println("Multiplication of " + num1 + " and " + num2 + " is " + (num1 * num2));
				break;
			case 4:
				System.out.println("Division of " + num1 + " and " + num2 + " is " + (num1 / num2));
				break;
			case 5:
				System.out.println("User Quit");
				break;
			}

			System.out.println("Do you want to continue or not : ");
			s = sc.next();
		} while (s.equals("continue"));
		sc.close();

	}

}
