package module4;
import java.util.Scanner;

public class GuessANumberGame {

	public static void main(String[] args) {
		boolean playing = true;
		char userChoice, highorLow;
		int maxGuess, minGuess, guesses, userNumber, computerGuess;
		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to computer guess!");
		System.out.println("You will think of a number between 1 and 100.");
		System.out.println("Then the computer will then try to guess the number.");
		System.out.println("OK! Think of a number between 1 and 100.");
		userNumber = input.nextInt();

		do {
			userChoice = 'n';
			maxGuess = 101;
			minGuess = 1;
			guesses = 0;
			do {
				guesses++;
				computerGuess = (int) (Math.random() * (maxGuess - minGuess + 1)) + minGuess;
				System.out.println("Is your number " + computerGuess + "? (y/n)");
				userChoice = input.next().charAt(0);

				if (userChoice == 'n') {
					System.out.println("OK Did I guess too high or too low? (h/l)");
					highorLow = input.next().charAt(0);
					if (highorLow == 'h') {
						maxGuess = computerGuess - 1;
					} else {
						minGuess = computerGuess + 1;
					}
				}
			} while (userChoice == 'n');

			System.out.println("Yay! I got it!");

			if (guesses != 1) {
				System.out.println("It only took me " + guesses + " tries!");
			} else {
				System.out.println("It only took me one try!");
			}

			System.out.println("Do you want to play again?");

			userChoice = input.next().charAt(0);
			if (userChoice == 'n') {
				playing = false;
			}

		} while (playing == true);

		System.out.println("OK, have a great day!");
		input.close();
	}

}
