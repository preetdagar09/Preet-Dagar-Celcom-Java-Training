package com.celcom.day6;

public class TryCatchExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before exception");
		
		try { 
			int a = 10/0;
			int arr[] = {10, 20, 30};
			System.out.println(arr[3]);
			int b = Integer.parseInt("Hello");//It  will not execute as exception already occured above.
		} catch (ArithmeticException e) {
			System.out.println("A");
			try {
				int b = Integer.parseInt("Hello");
			} catch (NumberFormatException e1) {
				System.out.println(e1);
			}
		} catch(NumberFormatException e) {
			System.out.println("B");	
		} catch (NegativeArraySizeException e) {
			
		} catch(Exception e) { //But you cannot write it before sub-types,i.e, In the above ArithmeticException all this.Because then these will be unreachable.
			System.out.println("D");
		}
		
		System.out.println("After Exception");

	}

}
