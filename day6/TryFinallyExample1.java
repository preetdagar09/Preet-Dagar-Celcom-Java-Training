package com.celcom.day6;

public class TryFinallyExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before exception");
		try { 
			int a = 10/0;
			} catch(NumberFormatException e) {
				System.out.println("B");	
			} catch (NegativeArraySizeException e) {
				System.out.println("B");
			} finally {
				System.out.println("Inside Finally");
			}
		
		System.out.println("After Exception");
	}

}
