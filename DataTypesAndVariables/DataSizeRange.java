public class DataSizeRange {
    public static void main(String[] args) {
        // Integer
        System.out.println("int min: " + Integer.MIN_VALUE);
        System.out.println("int max: " + Integer.MAX_VALUE);
        System.out.println("int bytes: " + Integer.BYTES);
        System.out.println();

        // Byte
        System.out.println("byte min: " + Byte.MIN_VALUE);
        System.out.println("byte max: " + Byte.MAX_VALUE);
        System.out.println("byte bytes: " + Byte.BYTES);
        System.out.println();

        // Short
        System.out.println("short min: " + Short.MIN_VALUE);
        System.out.println("short max: " + Short.MAX_VALUE);
        System.out.println("short bytes: " + Short.BYTES);
        System.out.println();

        // Long
        System.out.println("long min: " + Long.MIN_VALUE);
        System.out.println("long max: " + Long.MAX_VALUE);
        System.out.println("long bytes: " + Long.BYTES);
        System.out.println();

        // Float
        System.out.println("float min: " + Float.MIN_VALUE);
        System.out.println("float max: " + Float.MAX_VALUE);
        System.out.println("float bytes: " + Float.BYTES);
        System.out.println();

        // Double
        System.out.println("double min: " + Double.MIN_VALUE);
        System.out.println("double max: " + Double.MAX_VALUE);
        System.out.println("double bytes: " + Double.BYTES);
        System.out.println();

        // Character
        System.out.println("char min: " + (int) Character.MIN_VALUE);
        System.out.println("char max: " + (int) Character.MAX_VALUE);
        System.out.println("char bytes: " + Character.BYTES);
        System.out.println();

        // Boolean
        System.out.println("boolean: true/false (no exact size in Java)");
    }
}
