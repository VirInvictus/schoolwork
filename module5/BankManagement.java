package module5;

import java.util.Scanner;

public class BankManagement {
	private static final Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		double balance = 0;
		int userOption = 0;
		
		System.out.println("Welcome to the Bank Account Manager");
		if (balance <= 0) {
			System.out.println("Please enter the initial balance for your account (amount must be > 0)");
			System.out.println("$ ");
			while (balance <= 0) {
				balance = input.nextDouble();
				if (balance <= 0) {
					System.out.println("Amount must be > 0.");
				}
			}
		}
			
		do {
				userOption = displayMenu();
			
				if (userOption == 1) {
					displayBalance(balance);
				} else if (userOption == 2) {
					balance = depositFunds(balance);
				} else if (userOption == 3) {
					balance = withdrawFunds(balance);
				}
		} while (userOption != 4);
		
		System.out.println("Thank you for using the Bank Account Manager.");
		System.out.println("Goodbye!");
		
		input.close();
	}
	
	public static void displayBalance(double balance) {
		System.out.printf("\nCurrent balance: %.2f", balance);
	}
	
	public static double depositFunds(double balance) {
		double newFunds = 0;
		
		while (newFunds <= 0) {
			System.out.println("Enter amount to deposit (amount must be > 0");
			newFunds = input.nextDouble();
			if (newFunds <= 0) {
				System.out.println("Amount must be > 0");
			}
		}
		
		balance += newFunds;
		System.out.println("Deposited $" + newFunds + " successfully.");
		System.out.printf("\nNew balance: $%.2f", balance);
		return balance;
	}
	
	public static double withdrawFunds(double balance) {
		double newFunds = 0;
		boolean withdrawalValid = false;
		
		do {
			System.out.println("Enter amount to withdraw (amount must be > 0");
			newFunds = input.nextDouble();
			if (newFunds > 0 && newFunds <= balance) {
				withdrawalValid = true;
			} else {
				if (newFunds < 0) {
					System.out.println("Amount must be above zero.");
				}
				if (newFunds > balance) {
					System.out.println("Insufficient funds. Withdrawal failed.");
				}
				withdrawalValid = false;
			}
		} while (withdrawalValid != true);
		
		System.out.println("Withdrew " + newFunds + " successfully.");
		balance -= newFunds;
		System.out.printf("\nNew balance: $%.2f", balance);
		return balance;
	}
	
	public static int displayMenu() {
		Scanner menuOption = new Scanner(System.in);
		int userOption = 0;
		
		do {
			System.out.println("\n");
			System.out.println("Main Menu:");
			System.out.println("1. Display balance");
			System.out.println("2. Deposit money");
			System.out.println("3. Withdraw money");
			System.out.println("4. Exit");
			System.out.println("\n");
			System.out.println("Choose an option:");
			userOption = menuOption.nextInt();
			if (userOption < 1 || userOption > 4) {
				System.out.println("PLEASE USE ONLY THE OPTIONS PROVIDED");
			}
		} while (userOption < 1 || userOption > 4);
		
		return userOption;
	}
}
