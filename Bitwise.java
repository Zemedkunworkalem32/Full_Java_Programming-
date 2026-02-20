public class Bitwise {

    public static void main(String[] args) {

        // XOR swapping
        int a = 15;
        int b = 10; 

        System.out.println("Before swapping:");
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("\nAfter swapping:");
        System.out.println("a: " + a); // 10
        System.out.println("b: " + b); // 15

        // Byte shifting
        byte z;

        z = (byte)(15 << 4);
        System.out.println("\nAfter (15 << 4): " + z);  // -16

        z = (byte)(z >> 4);
        System.out.println("After signed shift (>> 4): " + z);  // -1
    }
}