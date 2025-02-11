package com.celcom.day6;
import java.util.Scanner;

class NoVowelsException extends Exception{
	
	@Override
	public String toString(){
		return "Does not contain vowels";
	}
}

public class Assignment2 {
	
	public static boolean containsVowel(String string) {
		for(char i : string.toCharArray()) {
			char ch = Character.toLowerCase(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
				return true;
			}
		return false;
		}
		


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String string = sc.next();
		try {
			if(!containsVowel(string)) { 
				throw new NoVowelsException();
			} else {
				System.out.println("The string contains vowel");
			}
		} catch(NoVowelsException e) {
			e.printStackTrace();
		}
		

	}

}
