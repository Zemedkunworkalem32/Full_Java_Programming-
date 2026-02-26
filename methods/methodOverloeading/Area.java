
import java.util.Scanner;

public class Area {
    // Method to calculate area of a rectangle
    static double area(double length, double width) {
        return length * width; // Area = length * width
    }

    // Method to calculate area of a circle
    static double area(double radius) {
        return Math.PI * radius * radius; // Area = π * r^2
    }
    // Method to calculate area of a square
    static double area(float side) {
        return side * side; // Area = side^2 for a square
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Calculate area of a rectangle    
            System.out.print("Enter the length of the rectangle: ");
            double length = scanner.nextDouble();
            System.out.print("Enter the width of the rectangle: ");
            double width = scanner.nextDouble();
            double rectangleArea = area(length, width);

            // Calculate area of a circle
            System.out.print("Enter the radius of the circle: ");
            double radius = scanner.nextDouble();
            double circleArea = area(radius);

            // Calculate area of a square
            System.out.print("Enter the side length of the square: ");
            float side = scanner.nextFloat();
            double squareArea = area(side);

            System.out.println("Area of the rectangle: " + rectangleArea);
            System.out.println("Area of the circle: " + circleArea);
            System.out.println("Area of the square: " + squareArea);
        }
    }
  
}
