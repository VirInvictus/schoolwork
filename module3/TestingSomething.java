package module3;
import java.util.Scanner;

public class TestingSomething {

	public static void main(String[] args) {
		int guess = -1;
		int number = (int) (Math.random() * 101);
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.println("Enter your guess: ");
			guess = input.nextInt();
			
			if (guess == number) {
				System.out.println("Yes, the number is " + number);
			} else if (guess > number) {
				System.out.println("Your number is too high!");
			} else {
				System.out.println("Your number is too low.");
			}
		} while (guess != number);
		
		input.close();
	}
}