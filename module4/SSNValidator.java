package module4;
import java.util.Scanner;

public class SSNValidator {

	public static void main(String[] args) {
		String userSSN;
		boolean valid = false;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a SSN: ");
		userSSN = input.next();
		
		if (userSSN.length() != 11) {
			valid = false;
		} else {
			valid = true;
		}
		
		for (int i = 0; i < userSSN.length(); i++) {
			if (i == 3 || i == 6) {
				if (userSSN.charAt(i) != '-') {
					valid = false;
					break;
				}
			} else {
				if (!Character.isDigit(userSSN.charAt(i))) {
					valid = false;
					break;
				}
			
			}
		}
		
		if (valid) {
			System.out.println("This is valid.");
		}
		else {
			System.out.println("This is not valid.");
		}
				
	}
}