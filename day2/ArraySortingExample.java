package com.celcom.day2;
import java.util.Arrays;
public class ArraySortingExample {

	public static void main(String[] args) {
		int arr[] = {2,4,5,7,1,3};
		String arr2[] = {"dfdds","dfdfd","sfsd"};
		boolean arr3[] = {false,true,false};
		Arrays.sort(arr);
		Arrays.sort(arr2);
		//Ascending order
		for(int index = 0; index < arr.length;index++) {
			System.out.print(arr[index] + " ");
		}
		//String array sorted
		for(int index = 0; index < arr2.length;index++) {
			System.out.println(arr2[index]);
		}
		//Descending array
		for(int index = arr.length-1; index >= 0;index--) {
			System.out.println(arr[index] + " ");
		}
		

	}

}
