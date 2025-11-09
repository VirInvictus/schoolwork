package module2;
import java.util.Scanner;

public class ComputeRectangle {

	public static void main(String[] args) {
        double width, height, area;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the width of the rectangle: ");
        width = input.nextDouble();
        System.out.print("Enter the height of the rectangle: ");
        height = input.nextDouble();

        area = width * height;
        System.out.println("The area of the rectangle is: " + area);
        input.close();
	}

}
