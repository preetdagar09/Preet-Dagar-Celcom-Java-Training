package com.celcom.day2;
import java.util.Scanner;
public class PatternWithOneForLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of rows : ");
		int n = sc.nextInt();
		String temp = "*";
		for(int i = 1;i<n;i++) {
			System.out.println(temp);
			temp= temp+"*";
		}

	}

}
