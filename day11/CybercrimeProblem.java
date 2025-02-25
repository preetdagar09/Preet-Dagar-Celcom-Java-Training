package com.celcom.day11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class CybercrimeProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many transactions: ");
		int tnum = sc.nextInt();
		
		int[] transaction = new int[tnum];
		System.out.println("Enter the transactions :");
		for(int i = 0; i<transaction.length ; i++) {
			transaction[i] = sc.nextInt();
		}
		
		System.out.println("Enter the stolen amount :");
		int stolenamt = sc.nextInt();
		
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i< tnum; i++) {
			int sum = 0;
			list.clear();
			for(int j = i; j< tnum ; j++) {
				if(sum < stolenamt) {
					sum += transaction[j];
					list.add(transaction[j]);
				}
				else {
					break;
				}
			if(sum == stolenamt) {
				System.out.println(list);
			}

			}
		}
	}

}
