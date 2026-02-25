public class DeletingElementOfArray {
  public static void main(String[] args) {
      int[] A = {12, 11, 10, 9, 8, 7, 6, 5, 4, 3};
      int n = A.length; // Current number of elements in the array
      System.out.println("Original array:");
      for (int i = 0; i < n; i++) {
          System.out.print(A[i] + " ");
      }
      int elementToDelete = 10; // Element to be deleted
      int position = -1; // Position of the element to be deleted
      for (int i = 0; i < n; i++) {
          if (A[i] == elementToDelete) {
              position = i;
              break;
          }
      }
      if (position != -1) {
          // Shift elements to the left to remove the element
          for (int i = position; i < n - 1; i++) {
              A[i] = A[i + 1];
          }
          n--; // Decrement the count of elements in the array
          System.out.println("\nArray after deleting element " + elementToDelete + ":");
          for (int i = 0; i < n; i++) {
              System.out.print(A[i] + " ");
          }
      } else {
          System.out.println("\nElement " + elementToDelete + " not found in the array.");
      }
  }
  
}
