package module3;

import java.util.Scanner;
/*
 * Guess the dice roll
 * The user attempts to predict the outcome of a six-sided dice roll. The user is then
 * told how close they are to the correct number
 * 
 * 	BEGIN
 * 		INIT diceRoll 1 TO 6
 * 		OUTPUT "Take a guess at the dice roll, please: "
 * 		INPUT guess
 * 		IF guess == diceRoll:
 * 			OUTPUT "Amazing. You must be a psychic!"
 * 		ELSE IF guess > diceRoll:
 * 			OUTPUT "Wrong. Loser.  You thought you were a psychic? You're up by " + (guess - diceRoll) + " numbers."
 * 		ELSE IF guess < diceRoll:
 * 			OUTPUT "Wrong one, silly. You're under by " (diceRoll - guess) + " numbers."
 *      ELSE
 *      	OUTPUT "THere is something wrong in the universe. Or you typed in a letter."
 * 	END
 * 
 */

public class GuessDiceRoll {

	public static void main(String[] args) {
		int diceRoll = (int)((Math.random() * 6) + 1);
		int guess;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Take a guess at the dice roll please: ");
//		System.out.println("DEBUG: " + diceRoll);
		guess = input.nextInt();
		
		if (guess == diceRoll) {
			System.out.println("Amazing! You must be a psychic!");
		} else if (guess > diceRoll) {
			System.out.println("Wrong. Loser. You thought you were psychic? You're up by " + (guess - diceRoll) + ".");
		} else if (guess < diceRoll) {
			System.out.println("Wrong one, silly. You're under by " + (diceRoll - guess) + ".");
		} else {
			System.out.println("There is something wrong in the universe.");
		}
		
		input.close();
	}

}
