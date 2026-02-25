public class ArrayExample {
    public static void main(String[] args) {

        // Declare and initialize an array
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;

        // Access elements
        System.out.println("First element: " + numbers[0]);
        System.out.println("Second element: " + numbers[1]);

        // Loop through array
        System.out.println("All elements:");
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            System.out.println(numbers[i]);
        }
        System.out.println("Sum of all elements: " + sum);
    }
}