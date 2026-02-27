
import java.util.Scanner;

public class AreaOfShapes {
  double radius;
  double length;
  double breadth;
  double height;
  // Constructor for circle
  AreaOfShapes(double radius) {
    this.radius = radius;
  }
  AreaOfShapes(double length, double breadth) {
    this.length = length;
    this.breadth = breadth;
  }

  // Use a static factory method for cylinder to avoid constructor conflict
  public static AreaOfShapes createCylinder(double radius, double height) {
    AreaOfShapes shape = new AreaOfShapes(radius);
    shape.height = height;
    return shape;
  }
  

  double areaOfCircle() {
    return Math.PI * radius * radius;
  }
  double areaOfRectangle() {
    return length * breadth;
  }
  double areaOfCylinder() {
    return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
  }
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the radius of the circle: ");
      double radius = sc.nextDouble();
      AreaOfShapes circle = new AreaOfShapes(radius);
      System.out.println("Area of Circle: " + circle.areaOfCircle());

      System.out.print("Enter the length and breadth of the rectangle: ");
      double length = sc.nextDouble();
      double breadth = sc.nextDouble();
      AreaOfShapes rectangle = new AreaOfShapes(length, breadth);
      System.out.println("Area of Rectangle: " + rectangle.areaOfRectangle());

      System.out.print("Enter the radius and height of the cylinder: ");
      double cylRadius = sc.nextDouble();
      double height = sc.nextDouble();
      AreaOfShapes cylinder = AreaOfShapes.createCylinder(cylRadius, height);
      System.out.println("Area of Cylinder: " + cylinder.areaOfCylinder());
    }
  }
  
}
