package com.celcom.day6;
import java.util.Scanner;

class DuplicateValueException extends Exception{
	int num;
	DuplicateValueException(int num){
		this.num = num;
	}
	@Override
	public String toString(){
		return num + " - Duplicate value ";
	}
}

public class Assignment1 {


	public static void main(String[] args){
		int arr[] = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");

		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			int temp = arr[i];
			for(int j=0; j<i; j++) {
 {
					try {
						if(temp == arr[j]) {
							throw new DuplicateValueException(arr[j]);
						}
					} catch (DuplicateValueException e) {
						System.out.println(e);
					}
				}
				
				
			}
		}
		

	}

}
