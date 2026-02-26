public class SumOfVarArg {
    // Method to calculate the sum of variable number of integers
    static int sum(int... num) {
        int total = 0; // Initialize total to 0
        for (int n : num) {
            total += n; // Add each number in the variable argument list to total
        }
        return total; // Return the calculated sum
    }

    public static void main(String[] args) {
        System.out.println("Sum of 1, 2, 3 is : " + sum(1, 2, 3));
        System.out.println("Sum of 4, 5, 6, 7, 8 is : " + sum(4, 5, 6, 7, 8));
        System.out.println("Sum of 8, 9, 10, 11, 12, 13, 14 is : " + sum(8, 9, 10, 11, 12, 13, 14));
        System.out.println("Sum of array {15, 16, 17, 18, 19, 20} is : " + sum(new int[] {15, 16, 17, 18, 19, 20})); // Passing an array to the variable argument method
    }
  
}
