public class UsingThrowAndThrows {
  // using multiple throws
  public static void method1() throws Exception {
    throw new Exception("Exception from method1");
  }
  public static void method2() throws Exception {
    throw new Exception("Exception from method2");
  }
  public static void main(String[] args) {
    try {
      method1();
    } catch (Exception e) {
      System.out.println("Caught Exception from method1: " + e.getMessage());
    }
    
    try {
      method2();
    } catch (Exception e) {
      System.out.println("Caught Exception from method2: " + e.getMessage());
    }
  }
  
}
