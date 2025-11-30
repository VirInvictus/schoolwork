package module5;

import java.util.Scanner;

public class MathWhiz {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String userOption = "";
		
		System.out.println("Welcome to MathWhiz!");
	
		do {
			userOption = displayMenu();
		
			if (userOption.equals("find")) {
				findMultiples();
			} else if (userOption.equals("tt")) {
				timesTable();
			} else if (userOption.equals("sqrt")) {
				squareRoot();
			}
	} while ((!"quit".equals(userOption)));
		
		input.close();
		System.out.println("Thank you for using MathWhiz!");
	}
	
	public static String displayMenu() {
		Scanner menuOption = new Scanner(System.in);
		String userOption = "";
		
		do {
			System.out.println("\n");
			System.out.println("Main Menu:");
			System.out.println("(find) Find all multiples of a given number.");
			System.out.println("(tt) Show all of the multiples of a given number from 1-12.");
			System.out.println("(sqrt) Show the square root of a given number.");
			System.out.println("(quit) Quit the program.");
			System.out.println("\n");
			System.out.println("Choose an option:");
			
			userOption = menuOption.nextLine();
			userOption = userOption.toLowerCase();
			
			if ((!"tt".equals(userOption)) && (!"find".equals(userOption)) && (!"sqrt".equals(userOption)) && (!"quit".equals(userOption))) {
				System.out.println("PLEASE USE ONLY THE OPTIONS PROVIDED");
			}
		}  while ((!"tt".equals(userOption)) && (!"find".equals(userOption)) && (!"sqrt".equals(userOption)) && (!"quit".equals(userOption)));
		
		return userOption;
	}
	
	public static void findMultiples() {
		Scanner input = new Scanner(System.in);
		int userNum;
		char userChoice = 'y';
		
		do {
			do {
				System.out.println("Please give a number:");
				userNum = input.nextInt();
				if (userNum < 0) {
					System.out.println("Please select a number over 0.");
				}
			} while (userNum < 0);
			
			System.out.println(userNum + " is divisible by :");
			for (int i = 1; i <= userNum; i += 1) {
					if (userNum % i == 0) {
						if (userNum != i) {
							System.out.println(i);
						}
					} 
			}
			
			do {
				System.out.println("Would you like to check out another number?");
				userChoice = input.next().charAt(0);
				
				if (userChoice != 'y' && userChoice != 'n') {
					System.out.println("Only 'y' or 'n', please.");
				}
			} while (userChoice != 'y' && userChoice != 'n');
		} while (userChoice == 'y');
	}
	
	public static void timesTable() {
		Scanner input = new Scanner(System.in);
		double userNum;
		char userChoice = 'y';
		
		do {
			do {
				System.out.println("Please give a number:");
				userNum = input.nextDouble();
				if (userNum < 0) {
					System.out.println("Please select a number over 0.");
				}
			} while (userNum < 0);
			
			for (int i = 1; i <= 12; i++) {
				if (userNum % 1 == 0) {
					System.out.println((int)userNum + " * " + i + " = " + (int)(userNum * i));
				} else {
					System.out.println(userNum + " * " + i + " = " + (userNum * i));
				}
			}
			
			do {
				System.out.println("Would you like to check out another number?");
				userChoice = input.next().charAt(0);
				
				if (userChoice != 'y' && userChoice != 'n') {
					System.out.println("Only 'y' or 'n', please.");
				}
			} while (userChoice != 'y' && userChoice != 'n');
		} while (userChoice == 'y');
	}

	public static void squareRoot() {
		Scanner input = new Scanner(System.in);
		double userNum;
		char userChoice = 'y';
		
		do {
			do {
				System.out.println("Please give a number:");
				userNum = input.nextDouble();
				if (userNum < 0) {
					System.out.println("Please select a number over 0.");
				}
			} while (userNum < 0);
			
			System.out.println("The square root of " + userNum + " is " + (Math.sqrt(userNum)));
			
			do {
				System.out.println("Would you like to check out another number?");
				userChoice = input.next().charAt(0);
				
				if (userChoice != 'y' && userChoice != 'n') {
					System.out.println("Only 'y' or 'n', please.");
				}
			} while (userChoice != 'y' && userChoice != 'n');
		} while (userChoice == 'y');
	}
}
