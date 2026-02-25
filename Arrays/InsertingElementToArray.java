public class InsertingElementToArray {
  public static void main(String[] args) {
    int[] A = new int[10];
    A[0] = 1;
    A[1] = 2;
    A[2] = 3;   
    A[3] = 4;
    A[4] = 5;   
    A[5] = 6;
    int n = 6; // Current number of elements in the array
    System.out.println("Original array:");
    for (int i = 0; i < n; i++) {
        System.out.print(A[i] + " ");
    }
    int elementToInsert = 10; // Element to be inserted
    int position = 3; // Position where the element should be inserted (0-based index
    // Shift elements to the right to make space for the new element
    for (int i = n; i > position; i--) {
        A[i] = A[i - 1];
    }
    A[position] = elementToInsert;
    n++; // Increment the count of elements in the array
    System.out.println("\nArray after inserting element:" + elementToInsert + " at position " + position + " is:");
    for (int i = 0; i < n; i++) {
        System.out.print(A[i] + " ");
    }
  }
  
}
