package module2;

/* Write a program that reads the subtotal and the gratuity (tip) rate, then computes the gratuity (tip
amount) and total.
For example, if the user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5 as
gratuity and $11.5 as total */ 

/*
 * begin
 * 		output "Enter subtotal: "
 *  	input subTotal
 *  	output "Gratuity rate %: "
 *  	input gratRate
 *  
 *  	let gratTotal be subTotal * (gratRate / 100)
 *  	let fTotal be gratTotal + subTotal
 *  
 *  	output gratTotal + " is your gratuity."
 *  	output fTotal + " is your total."
 *  end
 */

import java.util.Scanner;

public class CalcTIps {

	public static void main(String[] args) {
		double subTotal, fTotal, gratTotal, gratRate;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter subtotal: ");
		subTotal = input.nextDouble();
		System.out.println("Enter Gratuity Rate: ");
		gratRate = input.nextDouble();
		
		gratTotal = subTotal * (gratRate / 100);
		fTotal = subTotal + gratTotal;

		System.out.println(gratTotal + "% is your gratuity.");
		System.out.println(fTotal + " is your total.");
		input.close();
	}

}
