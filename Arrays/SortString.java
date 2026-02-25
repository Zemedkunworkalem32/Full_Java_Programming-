public class SortString {
  public static void main(String[] args) {
      String[] arr = {"banana", "apple", "grape", "orange", "kiwi", "melon",
                        "peach", "pear", "plum", "strawberry,", "watermelon"};
      // Print the original array
      System.out.println("Original array:");
      for (String s : arr) {
        System.out.print(s + " ");
      }
      System.out.println(); // Move to the next line after printing all elements

      // Sort the array using bubble sort
     java.util.Arrays.sort(arr);

      // Print the sorted array
      System.out.println("Sorted array:");
      for (String s : arr) {
        System.out.print(s + " ");
      }
      System.out.println(); // Move to the next line after printing all elements
  }
  
}
