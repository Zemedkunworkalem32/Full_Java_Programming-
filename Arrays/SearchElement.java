public class SearchElement {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int key = 9;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == key) {
                System.out.println("Element found at index: " + i);
                return;
            }
        }
        System.out.println("Element not found in the array.");
    }
  
}
