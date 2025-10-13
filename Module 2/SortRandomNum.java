package module3;

/*
 * Sort random numbers
 * 
 * Write a program that generates three random numbers between 1 – 100. The
 * program displays the three numbers, and then displays them again in ascending
 * order
 * 
 * 	BEGIN
 * 		INIT num1 = random(1, 100)
 * 		INIT num2 = random(1, 100)
 * 		INIT num3 = random(1, 100)
 * 
 * 		OUTPUT "1: " + num1 + " | 2: " + num2 + " | 3: " + num3
 * 		
 * 		IF (num1 < num2 && num1 < num3):
 * 			IF (num2 < num3):
 * 				OUTPUT "1: " + num1 + " | 2: " + num2 + " | 3: " + num3
 * 			ELSE
 * 				OUTPUT "1: " + num1 + " | 3: " + num3 + " | 2: " + num2
 * 		ELSE IF (num2 < num1 && num2 < num3):
 * 			IF (num1 < num3):
 * 				OUTPUT "2: " + num2 + " | 1: " + num1 + " | 3: " + num3
 * 			ELSE
 * 				OUTPUT "2: " + num2 + " | 3: " + num3 + " | 1: " + num1
 * 		ELSE IF (num3 < num1 && num3 < num2):
 * 			IF (num1 < num2):
 * 				OUTPUT "3: " + num3 + " | 1: " + num1 + " | 2: " + num2
 * 			ELSE
 * 				OUTPUT "3: " + num3 + " | 2: " + num2 + " | 1: " + num1
 * 	END
 */

public class SortRandomNum {

	public static void main(String[] args) {
		int num1 = (int)((Math.random() * 100) + 1);
		int num2 = (int)((Math.random() * 100) + 1);
		int num3 = (int)((Math.random() * 100) + 1);
		
		System.out.println("\t\tORIGINAL:");
		System.out.println("\t1: " + num1 + "\t| 2: " + num2 + "\t| 3: " + num3);
		System.out.println();
		
		if (num1 < num2 && num1 < num3) {
			if (num2 < num3) {
				System.out.println("\t1: " + num1 + "\t| 2: " + num2 + "\t| 3: " + num3);
			} else {
				System.out.println("\t1: " + num1 + "\t| 3: " + num3 + "\t| 2: " + num2);
			}
		} else if (num2 < num1 && num2 < num3) {
			if (num1 < num3) {
				System.out.println("\t2: " + num2 + "\t| 1: " + num1 + "\t| 3: " + num3);
			} else {
				System.out.println("\t2: " + num2 + "\t| 3: " + num3 + "\t| 1: " + num1);
			}
		} else if (num3 < num1 && num3 < num2) {
			if (num1 < num2) {
				System.out.println("\t3: " + num3 + "\t| 1: " + num1 + "\t| 2: " + num2);
			} else {
				System.out.println("\t3: " + num3 + "\t| 2: " + num2 + "\t| 1: " + num1);
			}
		}
	}

}
