public class TwoDArray {
  public static void main(String[] args) {
      int[][] A = {
          {1, 2, 3},
          {4, 5, 6},
          {7, 8, 9}
      };

      System.out.println("Two-dimensional array:");
      for (int[] row : A) {
          for (int value : row) {
              System.out.print(value + " ");
          }
          System.out.println(); // Move to the next line after each row
      }
  }
  
}
