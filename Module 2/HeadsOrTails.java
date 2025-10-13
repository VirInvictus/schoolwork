package module3;

import java.util.Scanner;

/*
 * Heads or tails.
 * 
 * Write a program that lets the user guess whether the flip of a coin results in heads
 * or tails. The program randomly generates an integer 0 or 1, which represents heads
 * or tails. The program prompts the user to enter a guess, and reports whether the
 * guess is correct or incorrect.
 * 
 * 	BEGIN
 * 		initialize coinFlip to random number between 1 and 0
 * 		IF coinFlip == 0
 * 			toss = "heads"
 * 		ELSE
 * 			toss = "tails"
 * 		OUTPUT "Please enter your guess. (lower case please)"
 * 		INPUT userGuess
 * 		IF userGuess == toss
 * 			OUTPUT "You are correct!"
 * 		ELSE
 * 			OUTPUT "You are wrong. It was " + toss + "."
 * 	END
 */

public class HeadsOrTails{

	public static void main(String[] args) {
		int coinFlip = (int)(Math.random() * 2);
		String toss, guess;
		Scanner input = new Scanner(System.in);
		
		if (coinFlip == 0) {
			toss = "heads";
		} else {
			 toss = "tails";
		}
		
		System.out.println("Please enter your guess: ");
		guess = input.next().toLowerCase();
		
		if (guess.equals(toss)) {
			System.out.println("Wow! You are so good at this. You guessed correctly!");
		} else {
			System.out.println("Unforunately, the correct answer was \"" + toss + ".\" Better luck next time!");
		}
		
		input.close();
	}

}
