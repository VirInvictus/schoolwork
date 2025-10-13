package module2;
import java.util.Scanner;

public class SumsAndDifferences {

	public static void main(String[] args) {
		double firstNumber, secondNumber;
		double diffNum, sumNum;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your first number: " );
		firstNumber = input.nextDouble();
		System.out.println("Please enter your second number: " );
		secondNumber = input.nextDouble();
		
		diffNum = firstNumber - secondNumber;
		sumNum = firstNumber + secondNumber;
		
		System.out.println("The difference of your numbers: " + diffNum);
		System.out.println("The sum of your numbers: " + sumNum);
		input.close();
	}

}
