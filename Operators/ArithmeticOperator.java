public class ArithmeticOperator {
  public static void main(String[] args) {

        // ===================== BYTE =====================
        byte b1 = 10, b2 = 3;
        System.out.println("BYTE OPERATIONS:");
        System.out.println("Addition: " + (b1 + b2));
        System.out.println("Subtraction: " + (b1 - b2));
        System.out.println("Multiplication: " + (b1 * b2));
        System.out.println("Division: " + (b1 / b2));
        System.out.println("Modulus: " + (b1 % b2));
        System.out.println();

        // ===================== SHORT =====================
        short s1 = 1000, s2 = 300;
        System.out.println("SHORT OPERATIONS:");
        System.out.println("Addition: " + (s1 + s2));
        System.out.println("Subtraction: " + (s1 - s2));
        System.out.println("Multiplication: " + (s1 * s2));
        System.out.println("Division: " + (s1 / s2));
        System.out.println("Modulus: " + (s1 % s2));
        System.out.println();

        // ===================== INT =====================
        int i1 = 200000, i2 = 50000;
        System.out.println("INT OPERATIONS:");
        System.out.println("Addition: " + (i1 + i2));
        System.out.println("Subtraction: " + (i1 - i2));
        System.out.println("Multiplication: " + (i1 * i2));
        System.out.println("Division: " + (i1 / i2));
        System.out.println("Modulus: " + (i1 % i2));
        System.out.println();

        // ===================== LONG =====================
        long l1 = 10000000000L, l2 = 3000000000L;
        System.out.println("LONG OPERATIONS:");
        System.out.println("Addition: " + (l1 + l2));
        System.out.println("Subtraction: " + (l1 - l2));
        System.out.println("Multiplication: " + (l1 * l2));
        System.out.println("Division: " + (l1 / l2));
        System.out.println("Modulus: " + (l1 % l2));
        System.out.println();

        // ===================== FLOAT =====================
        float f1 = 5.5f, f2 = 2.0f;
        System.out.println("FLOAT OPERATIONS:");
        System.out.println("Addition: " + (f1 + f2));
        System.out.println("Subtraction: " + (f1 - f2));
        System.out.println("Multiplication: " + (f1 * f2));
        System.out.println("Division: " + (f1 / f2));
        System.out.println("Modulus: " + (f1 % f2));
        System.out.println();

        // ===================== DOUBLE =====================
        double d1 = 12.34, d2 = 5.67;
        System.out.println("DOUBLE OPERATIONS:");
        System.out.println("Addition: " + (d1 + d2));
        System.out.println("Subtraction: " + (d1 - d2));
        System.out.println("Multiplication: " + (d1 * d2));
        System.out.println("Division: " + (d1 / d2));
        System.out.println("Modulus: " + (d1 % d2));
        System.out.println();

        // ===================== CHAR =====================
        char c1 = 'A', c2 = 1; // char arithmetic uses numeric Unicode values
        System.out.println("CHAR OPERATIONS (numeric values):");
        System.out.println("Addition: " + (c1 + c2));      // 'A' = 65 → 65 + 1 = 66
        System.out.println("Subtraction: " + (c1 - c2));
        System.out.println("Multiplication: " + (c1 * c2));
        System.out.println("Division: " + (c1 / c2));
        System.out.println("Modulus: " + (c1 % c2));
        System.out.println();

        // ===================== BOOLEAN =====================
        // Arithmetic operations are not allowed on boolean in Java
        System.out.println("BOOLEAN OPERATIONS:");
        System.out.println("Boolean does not support arithmetic operators in Java.");
    }
  
}
