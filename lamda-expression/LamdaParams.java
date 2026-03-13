interface Mylambda {
  void add(int a, int b);
}

public class LamdaParams {
  public static void main(String[] args) {
      // Using lambda expression to create a Mylambda instance with parameters
      Mylambda m = (a, b) -> System.out.println("The sum of " + a + " and " + b + " is: " + (a + b));

      // Calling the add method with parameters
      m.add(15, 98);
  }
}
