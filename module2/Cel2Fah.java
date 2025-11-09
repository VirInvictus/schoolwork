package module2;
import java.util.Scanner;

public class Cel2Fah {
	public static void main(String[] args) {
		double fahrenheit, celsius;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a temperature in Celsius: ");
		celsius = input.nextDouble();
	
		fahrenheit = (9.0 / 5.0) * celsius + 32;
		System.out.println(celsius + "C is " + fahrenheit + "F");
		input.close();
	}
}
