package com.celcom.day11;
import java.util.Scanner;

public class PossibleDecodingsProblem {
	
	void possibilities(String code) {
		int count = 1;
		for(int i = 0; i < code.length() - 1; i++) {
			if(code.charAt(i) == '1') {
				count+=1;
			}
			if (code.charAt(code.length()-1) == 2) {
				//
			}
			else if(code.charAt(i) == '2' && code.charAt(i+1) <= '6') {
				count+= 1;
			}
			
			
		}
		System.out.println(count);
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number string : ");
		String code = sc.nextLine();
		if(code.charAt(0)=='0') {
			System.out.println("Invalid");
		}
		else {
			PossibleDecodingsProblem obj1 = new PossibleDecodingsProblem();
			obj1.possibilities(code);
		}
		
		

	}

}
