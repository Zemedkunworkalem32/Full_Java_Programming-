
import java.util.Scanner;

public class Circle {
    private final  double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter
    public double getRadius() {
        return radius;
    }

    // Area
    public double area() {
        return Math.PI * radius * radius;
    }

    // Circumference
    public double circumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)){
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println("Circle with radius: " + circle.getRadius());
        System.out.println("Area: " + circle.area());
        System.out.println("Circumference: " + circle.circumference());


    System.out.println("Enter height of the cylinder: ");
    double height = scanner.nextDouble();
    Cylinder cylinder = new Cylinder(radius, height);
    System.out.println("Cylinder with radius: " + cylinder.getRadius() + " and height: " + cylinder.getHeight());
    System.out.println("Volume: " + cylinder.volume());
    }
}
}

// Separate class
class Cylinder extends Circle {

    private final  double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double volume() {
        return area() * height;
    }
}