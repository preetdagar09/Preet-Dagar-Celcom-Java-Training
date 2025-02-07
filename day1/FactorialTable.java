package com.celcom.day1;
import java.util.Scanner;
public class FactorialTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int factorial = 1;
		for(int i=1;i<=num;i++) {
			factorial = factorial * i;
			System.out.println("Factorial of " + i + " is " + factorial);
		}

	}

}
