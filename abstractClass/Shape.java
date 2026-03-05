abstract  class Shape {
  public abstract void Perimeter();
  public abstract void Area();

  
}
class Circle extends Shape {
  final private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public void Perimeter() {
    double perimeter = 2 * Math.PI * radius;
    System.out.println("Perimeter of the circle: " + perimeter);
  }

  @Override
  public void Area() {
    double area = Math.PI * radius * radius;
    System.out.println("Area of the circle: " + area);
  }
}

  class Rectangle extends Shape {
  final private double length;  
  final private double width;


  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  @Override
  public void Perimeter() {
    double perimeter = 2 * (length + width);
    System.out.println("Perimeter of the rectangle: " + perimeter);
  }

  @Override
  public void Area() {
    double area = length * width;
    System.out.println("Area of the rectangle: " + area);
  }

}

class Main {
  public static void main(String[] args) {
    Circle circle = new Circle(5);
    circle.Perimeter();
    circle.Area();

    Rectangle rectangle = new Rectangle(4, 6);
    rectangle.Perimeter();
    rectangle.Area();
  }
}
