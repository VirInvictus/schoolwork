package module4;

import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
		char randChar, userInput = 'y';
		double passLength;
		String userPassword;
		Scanner input = new Scanner(System.in);
		
		do {
			userPassword = "";
			passLength = 0;
			System.out.println("How long will your password be: ");
			while (passLength < 10) {
				passLength = input.nextInt();
				if (passLength < 10) {
					System.out.println("The password must be at least 10 characters.");
				}
			}
			for (double i = 0; i <= passLength; i++) {
				randChar = (char)((Math.random() * 93) + 33);
				userPassword += randChar;
			}
			System.out.println("Here is your password: " + userPassword);
			System.out.println("Do you want to generate another password (y/n)");
			
			do {
				userInput = input.next().charAt(0);
				if (userInput != 'y' && userInput != 'n') {
					System.out.println("Either 'y' or 'n', please.");
				}
			} while (userInput != 'y' && userInput != 'n');
			
		} while (userInput == 'y');
		
		input.close();
	}

}