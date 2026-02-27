
import java.util.Scanner;

public class DataHiding {
  
  private int length;
  private int breadth;

  public void getLengthAndBreadth(int length, int breadth) {
    this.length = length;
    this.breadth = breadth;
  }

  public int calculateArea() {
    return length * breadth;
  }
  public int calculatePerimeter() {
    return 2 * (length + breadth);
  } 

  //setters and getters for length and breadth
  public void setLengthAndBreadth(int length, int breadth) {
    if (length > 0 && breadth > 0) {
      this.length = length;
      this.breadth = breadth;
    } else {
      System.out.println("Length and breadth must be positive.");
    } 
  }

  // main method to test the DataHiding class
  public static void main(String[] args) {
    DataHiding rectangle = new DataHiding();
    try(Scanner scanner = new Scanner(System.in)) {
    System.out.print("Enter the length of the rectangle: ");
    int length = scanner.nextInt();
    System.out.print("Enter the breadth of the rectangle: ");
    int breadth = scanner.nextInt();
    rectangle.setLengthAndBreadth(length, breadth);
    int area = rectangle.calculateArea();
    int perimeter = rectangle.calculatePerimeter();
    System.out.println("Area of the rectangle: " + area);
    System.out.println("Perimeter of the rectangle: " + perimeter);
  } 
}


}
