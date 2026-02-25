public class ReverseArray {
  public static void main(String[] args) {
      int[] A = {12, 11, 10, 9, 8, 7, 6, 5, 4, 3};
      int[] R = new int[A.length]; // New array to hold reversed elements
      System.out.println("Original array:");
      for (int i = 0; i < A.length; i++) {
          System.out.print(A[i] + " ");
      }
      for (int i = 0; i < A.length; i++) {
          R[i] = A[A.length - 1 - i];
      }
      System.out.println("\nReversed array:");
      for (int i = 0; i < R.length; i++) {
          System.out.print(R[i] + " ");
      }
  }
  
}
