public class MatricesMultiplication {
  public static void main(String[] args) {
    int[][] A = {{1, 2, 3}, {4, 5, 6}};
    int[][] B = {{7, 8}, {9, 10}, {11, 12}};
    
    int[][] C = new int[A.length][B[0].length];
    // Print the original matrices
    System.out.println("Original Matrices:");
    System.out.println("Matrix A:");
    for (int[] row : A) {
      for (int value : row) {
        System.out.format("%2d", value);
      }
      System.out.println();
    }
    System.out.println("Matrix B:");
    for (int[] row : B) {
      for (int value : row) {
        System.out.format("%02d ", value);
      }
      System.out.println();
    }
    
    // Multiply A and B, store the result in C
    for (int i = 0; i < A.length; i++) {
      for (int j = 0; j < B[0].length; j++) {
        for (int k = 0; k < A[0].length; k++) {
          C[i][j] += A[i][k] * B[k][j];
        }
      }
    }
    
    // Print the result
    System.out.println("Result of A x B:");
    for (int[] row : C) {
      for (int value : row) {
        System.out.format("%03d ", value);
      }
      System.out.println();
    }
  }
  
}
