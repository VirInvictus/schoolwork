package module2;

/* 2. Health application: computing BMI

Body Mass Index (BMI) is a measure of health based on weight. It can be calculated by taking your
weight in kilograms and dividing it by the square of your height in meters.

Write a program that prompts the user to enter a weight in pounds and height in inches and displays the
BMI. Note one pound is 0.45359237 kilograms and one inch is 0.0254 meters. */

/*
 * begin
 * 		output "Please enter your weight in lbs: "
 * 		input weight
 * 		output "Please enter your height in inches: "
 * 		input height
 * 
 * 		let weight be weight * 0.45359237
 * 		let height be height * 0.0254
 * 		let returnBMI be weight / height^2
 * 
 * 		output "Your BMI is " + returnBMI
 * end
 */

import java.util.Scanner;

public class CalcBMI {

	public static void main(String[] args) {
		double weight, height, returnBMI;
		Scanner input = new Scanner(System.in);
		
		// Get weight input with validation
		System.out.print("Please enter your weight in lbs: ");
		weight = input.nextDouble();
		
		// Basic input validation for weight
		while (weight <= 0) {
			System.out.print("Weight must be positive. Please enter your weight in lbs: ");
			weight = input.nextDouble();
		}
		
		// Get height input with validation
		System.out.print("Please enter your height in inches: ");
		height = input.nextDouble();
		
		// Basic input validation for height
		while (height <= 0) {
			System.out.print("Height must be positive. Please enter your height in inches: ");
			height = input.nextDouble();
		}
		
		// Convert pounds to kilograms
		weight *= 0.45359237;
		
		// Convert inches to meters
		height *= 0.0254;
		
		// Calculate BMI using the formula: weight(kg) / height(m)^2
		returnBMI = weight / Math.pow(height, 2);
		
		// Display results with proper formatting
		System.out.printf("Your BMI is %.1f%n", returnBMI);
		
		// Provide BMI interpretation for educational value
		System.out.println("\nBMI Categories:");
		System.out.println("Underweight: BMI less than 18.5");
		System.out.println("Normal weight: BMI 18.5-24.9");
		System.out.println("Overweight: BMI 25-29.9");
		System.out.println("Obese: BMI 30 or greater");
		
		// Determine and display the user's category
		if (returnBMI < 18.5) {
			System.out.println("Your BMI indicates you are underweight.");
		} else if (returnBMI < 25) {
			System.out.println("Your BMI indicates you have normal weight.");
		} else if (returnBMI < 30) {
			System.out.println("Your BMI indicates you are overweight.");
		} else {
			System.out.println("Your BMI indicates you are obese.");
		}
		
		input.close();
	}
}