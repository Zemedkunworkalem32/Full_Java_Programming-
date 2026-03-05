public class Circle {
    private double radius;

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

        Circle circle = new Circle(5);
        System.out.println("Circle with radius " + circle.getRadius());
        System.out.println("Area: " + circle.area());
        System.out.println("Circumference: " + circle.circumference());

        Cylinder cylinder = new Cylinder(5, 10);
        System.out.println("\nCylinder with radius " + cylinder.getRadius() +
                " and height " + cylinder.getHeight());
        System.out.println("Volume: " + cylinder.volume());
    }
}

// Separate class
class Cylinder extends Circle {

    private double height;

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