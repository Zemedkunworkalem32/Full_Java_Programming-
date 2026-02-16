public class Literals {
  public static void main(String[] args) {

        // Integer literals
        int decimal = 100;          // decimal literal
        int octal = 012;            // octal literal (12 in octal = 10 decimal)
        int hex = 0x1A;             // hexadecimal literal
        int binary = 0b1010;        // binary literal

        // Floating-point literals
        float myFloat = 3.14f;      // float literal (f suffix)
        double myDouble = 3.14159;  // double literal
        double scientific = 1.2e3;  // scientific notation (1.2 × 10^3)

        // Character literals
        char letter = 'A';
        char digit = '7';
        char special = '\n';        // escape character

        // String literals
        String message = "Hello, Java!";

        // Boolean literals
        boolean flagTrue = true;
        boolean flagFalse = false;

        // Null literal
        String empty = null;

        // Print all literals
        System.out.println("Integer literals:");
        System.out.println("Decimal: " + decimal);
        System.out.println("Octal: " + octal);
        System.out.println("Hex: " + hex);
        System.out.println("Binary: " + binary);
        System.out.println();

        System.out.println("Floating-point literals:");
        System.out.println("Float: " + myFloat);
        System.out.println("Double: " + myDouble);
        System.out.println("Scientific: " + scientific);
        System.out.println();

        System.out.println("Character literals:");
        System.out.println("Letter: " + letter);
        System.out.println("Digit: " + digit);
        System.out.println("Special (newline follows):");
        System.out.println(special);
        System.out.println();

        System.out.println("String literal: " + message);
        System.out.println("Boolean literals: " + flagTrue + ", " + flagFalse);
        System.out.println("Null literal: " + empty);
    }
  
}
