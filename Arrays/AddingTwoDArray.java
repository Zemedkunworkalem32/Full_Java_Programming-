public class AddingTwoDArray {
  public static void main(String[] args) {
      int[][] A = {
          {1, 2, 3},
          {4, 5, 6},
          {7, 8, 9}
      };

      int[][] B = {
          {1, 2, 3},
          {6, 6, 6},
          {6, 7, 7}
      };

      int[][] C = new int[3][3]; // Resultant array to store the sum

      // Adding corresponding elements of A and B and storing in C
      for (int i = 0; i < A.length; i++) {
          for (int j = 0; j < A[i].length; j++) {
              C[i][j] = A[i][j] + B[i][j];
          }
      }

      System.out.println("Result of adding two 2D arrays:");
      for (int[] X : C) {
          for (int y : X) {
              System.out.format("%02d ", y);
          }
          System.out.println(); // Move to the next line after each row
      }
  }
  
}
