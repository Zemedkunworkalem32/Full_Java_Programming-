

public class VariableArgument {
    // Method to calculate the sum of variable number of integers
    static void show(int... num) {
       // Initialize total to 0
        for (int n : num) {
           System.out.print(n + " "); // Print each number in the variable argument list  
        }
          System.out.println(); // Print a new line after printing all numbers
  
    }

    public static void main(String[] args) {
      show();
      show(1, 2, 3);
      show(4, 5, 6, 7, 8);
      show(8, 9, 10, 11, 12, 13, 14);
      show( new int[] {15, 16, 17, 18, 19, 20} ); // Passing an array to the variable argument method
       
    }
  
}
