public class CallByReferences {
  static void modify(int[] arr) {
    arr[0] = arr[0] + 10; // This modification will affect the original array
    System.out.println("Inside modify method, arr[0]: " + arr[0]);
  }
  
  public static void main(String[] args) {
    int[] originalArr = {5};
    System.out.println("Before calling modify, originalArr[0]: " + originalArr[0]);
    modify(originalArr);
    System.out.println("After calling modify, originalArr[0]: " + originalArr[0]);
  }
  
}
