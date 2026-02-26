import java.util.Scanner;

public class ValidateNameAndAge {

    static boolean validateName(String name) {

        if (name == null || name.trim().isEmpty()) {
            System.out.println("Invalid name: Name cannot be empty.");
            return false;
        }

        if (!name.matches("[a-zA-Z]+")) {
            System.out.println("Invalid name: Name must contain only letters (a-z or A-Z).");
            return false;
        }

        return true;
    }

    static boolean validateAge(int age) {

        if (age < 0 || age > 120) {
            System.out.println("Invalid age: Age must be between 0 and 120.");
            return false;
        }

        return true;
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            // Validate name first
            if (!validateName(name)) {
                System.out.println("Program stopped due to invalid name.");
                return;   // STOP here — do not ask for age
            }

            // Only runs if name is valid
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            if (!validateAge(age)) {
                System.out.println("Invalid age entered.");
                return;
            }

            System.out.println("Name and age are valid.");
        }
    }
}