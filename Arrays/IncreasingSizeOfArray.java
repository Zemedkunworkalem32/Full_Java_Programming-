import java.util.Scanner;

public class IncreasingSizeOfArray {
  public static void main(String[] args) {
      int[] A = {12, 11, 10, 9, 8, 7, 6, 5, 4, 3};
      int[] B = new int[A.length * 2]; // New array with double the size
      System.out.println("Original array:");
      for (int i = 0; i < A.length; i++) {
          System.out.print(A[i] + " ");
      }
      System.arraycopy(A, 0, B, 0, A.length); // Efficiently copy elements from A to B

      try (Scanner sc = new Scanner(System.in)) {
          for (int i = A.length; i < B.length; i++) {
              System.out.println("Enter value for B[" + i + "]: ");
              B[i] = sc.nextInt(); // Read additional values from user input to fill the new array
          }
          System.out.println("\nNew array with increased size:");
          for (int i = 0; i < B.length; i++) {
              System.out.print(B[i] + " ");
          }
      }
  }
  
}
