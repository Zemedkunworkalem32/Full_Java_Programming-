public class SinlgetonClass {
private static SinlgetonClass instance;
private SinlgetonClass() {
  // private constructor to prevent instantiation
}
public static SinlgetonClass getInstance() {
  if (instance == null) {
    instance = new SinlgetonClass();
  }
  return instance;
}
public void display() {
  System.out.println("This is a singleton class.");
}

public static void main(String[] args) {
  SinlgetonClass singleton1 = SinlgetonClass.getInstance();
  SinlgetonClass singleton2 = SinlgetonClass.getInstance();
  
  singleton1.display();
  
  // Check if both instances are the same
  if (singleton1 == singleton2) {
    System.out.println("Both instances are the same.");
  } else {
    System.out.println("Instances are different.");
  }
}
}
