public class JaggedArray {
  public static void main(String[] args) {
      int[][] A = new int[3][]; // Declare a jagged array with 3 rows
      A[0] = new int[2]; // First row has 2 columns
      A[1] = new int[3]; // Second row has 3 columns
      A[2] = new int[4]; // Third row has 4 columns

      // Fill the jagged array with values
      for (int i = 0; i < A.length; i++) {
          for (int j = 0; j < A[i].length; j++) {
              A[i][j] = (i + 1) * (j + 1); // Assign values based on row and column indices
          }
      }

      System.out.println("Jagged array:");
      for (int[] row : A) {
          for (int value : row) {
              System.out.print(value + " ");
          }
          System.out.println(); // Move to the next line after each row
      }
  }
  
}
