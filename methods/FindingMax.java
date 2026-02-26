public class FindingMax {
  static int max(int a, int b) {
    if (a > b) {
      return a;
    }
    else {
      return b;
    }
  }
  public static void main(String[] args) {
    int a = 10, b = 20;
    System.out.println("Maximum of " + a + " and " + b + " is: " + max(a, b));
      
  }
  
}
