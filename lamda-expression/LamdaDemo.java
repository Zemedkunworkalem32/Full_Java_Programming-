interface Mylambda {
  void display();
}

public class LamdaDemo {
  public static void main(String[] args) {
    // Using lambda expression to create a Mylambda instance
    Mylambda mylambda = () -> System.out.println("Hello from the lambda expression!");
    
    // Calling the display method
    mylambda.display();
  }
  
}
