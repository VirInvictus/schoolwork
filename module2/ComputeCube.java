package module2;
import java.util.Scanner;

public class ComputeCube {

	public static void main(String[] args) {
		double side, area;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please give me the measurements of one of the sides of the cube: ");
		side = input.nextDouble();
		area = side * side * side;
		
		System.out.println("The area of the cube with a side of " + side + " is " + area);
		input.close();	
	}

}
