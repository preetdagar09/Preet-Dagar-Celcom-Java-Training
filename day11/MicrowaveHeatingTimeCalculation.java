package com.celcom.day11;
import java.util.Scanner;

public class MicrowaveHeatingTimeCalculation {
	static int recommendTime;
	
	public void finalRecommendedTime(int totalItems, int heatingTime, String foodType, String microwaveModel) {
		if(totalItems == 1) {
			recommendTime = heatingTime;
		}
		else if(totalItems == 2){
			recommendTime = heatingTime + (heatingTime/2); // 120 + 60 = 180
		}
		
		else if(totalItems == 3) {
			recommendTime = heatingTime * 2;
		}
		else {
			System.out.println("Invalid input. Not more than 3 Items..");
			System.exit(1);
		}
		
		if(foodType.equals("pasta")) {
			recommendTime = (int) (recommendTime + (recommendTime * 0.1)); 
		}
		else if(foodType.equals("frozen meal")) {
			recommendTime = (int) (recommendTime + (recommendTime * 0.2));
		}
		else if(foodType.equals("vegetables")) {
			
		}
		else{
			System.out.println("Invalid Food type");
			System.exit(1);
		}
		
		if(microwaveModel.equals("high")) {

		}
		else if(microwaveModel.equals("medium")) {
			recommendTime = (int) (recommendTime - (recommendTime * 0.1));
		}
		else if(microwaveModel.equals("low")) {
			recommendTime = (int) (recommendTime + (recommendTime * 0.15));
		}
		else{
			System.out.println("Invalid microwave model");
			System.exit(1);
		}
		
		System.out.println("The recommended heating time is : " + recommendTime + "seconds");
	
		
		
	}
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of items :");
		int totalItems = sc.nextInt();
		if(totalItems <= 0 || totalItems > 3) {
			System.out.println("Number of items cannot be negative");
			System.exit(1);
		}
		System.out.println("Enter the heating time for one item (in seconds) : ");
		int heatingTime = sc.nextInt();
		if(heatingTime <= 0) {
			System.out.println("Heating time must be positive value.");
			System.exit(1);
		}
		
		System.out.println("Enter the type of food : ");
		String foodType = sc.next().toLowerCase();
		
		System.out.println("Enter the microwave model (high, medium, low) : ");
		String microwaveModel = sc.next().toLowerCase();
		
		MicrowaveHeatingTimeCalculation obj1 = new MicrowaveHeatingTimeCalculation();
		obj1.finalRecommendedTime(totalItems, heatingTime, foodType, microwaveModel);
		
	}

}
