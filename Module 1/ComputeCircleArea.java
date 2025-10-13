package module2;
import java.util.Scanner;

public class ComputeCircleArea {

    public static void main(String[] args) {
        double area, radius;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number for the radius of the circle: ");
        radius = input.nextDouble();
        area = Math.PI * radius * radius;

        System.out.println("The area of a circle with radius " + radius + " is " + area);
        input.close();
    }
}
