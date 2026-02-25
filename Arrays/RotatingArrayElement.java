public class RotatingArrayElement {
  public static void main(String[] args) {
      int[] B = {12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
      int temp = B[B.length - 1];
      int[] R = new int[B.length];
      System.out.println("Original array:");
      for (int i = 0; i < B.length; i++) {
          System.out.print(B[i] + " ");
      }
      for (int i = 0; i < B.length - 1; i++){
          R[B.length - 1] = temp;
          R[i] = B[i + 1];
      }
      System.out.println("\nLeft Rotated array:");
      for (int i = 0; i < R.length; i++) {
          System.out.print(R[i] + " ");
      }
      int last = B[B.length - 1];

        // Shift elements to the right
        for (int i = B.length - 1; i > 0; i--) {
            R[i] = B[i - 1];
        }

        // Put last element at first position
        R[0] = last;

        System.out.println("\nRight Rotated array:");
        for (int i = 0; i < R.length; i++) {
            System.out.print(R[i] + " ");
        }
  }
  
}
