
public class CallByValue {
  static void modify(int num) {
    num = num + 10; // This modification will not affect the original variable
    System.out.println("Inside modify method, num: " + num);
  }
  
  public static void main(String[] args) {
    int originalNum = 5;
    System.out.println("Before calling modify, originalNum: " + originalNum);
    modify(originalNum);
    System.out.println("After calling modify, originalNum: " + originalNum);
  }
  
}
