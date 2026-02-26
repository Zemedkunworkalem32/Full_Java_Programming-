public class MaxOfVarArg {
    // Method to find the maximum of variable number of integers
    static int max(int... num) {
        if (num.length == 0) {
            throw new IllegalArgumentException("No numbers provided");
        }
        int max = num[0]; // Initialize max to the first element
        for (int n : num) {
            if (n > max) {
                max = n; // Update max if current number is greater
            }
        }
        return max; // Return the maximum value found
    }

    public static void main(String[] args) {
        System.out.println("Max of 1, 2, 3 is : " + max(1, 2, 3));
        System.out.println("Max of 4, 5, 6, 7, 8 is : " + max(4, 5, 6, 7, 8));
        System.out.println("Max of 8, 9, 10, 11, 12, 13, 14 is : " + max(8, 9, 10, 11, 12, 13, 14));
        System.out.println("Max of array {15, 16, 17, 18, 19, 20} is : " + max(new int[] {15, 16, 17, 18, 19, 20})); // Passing an array to the variable argument method
    }
  
}
