package com.celcom.day4;
import java.util.Scanner;


public class PronicNumber {
	 


	public static void main(String[] args) {
		
		boolean isPronic = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		for(int i = 0; i*(i+1)<=num; i++) {
			if(i*(i+1) == num) {
				 isPronic = true;
			}
			else {
				isPronic = false;
			}
		}
		
		if(isPronic == true) {
			System.out.println("It is a pronic number");
		}
		else {
			System.out.println("It is not a pronic number");
		}

	}

}
	
