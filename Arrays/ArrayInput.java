import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();

            int[] userArray = new int[size];
            int sum = 0;

            System.out.println("Enter " + size + " integers:");
            for (int i = 0; i < size; i++) {
                userArray[i] = scanner.nextInt();
                sum += userArray[i];
            }

            System.out.println("You entered:");
            for (int num : userArray) {
                System.out.print(num + " ");
            }

            System.out.println("\nSum = " + sum);
        }
    }
}