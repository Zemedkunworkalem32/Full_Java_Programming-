public class Increments {
  public static void main(String[] args) {

        int a = 10;

        // Post-increment
        System.out.println("Post-increment (a++): " + (a++));
        System.out.println("Value of a after a++: " + a);

        // Pre-increment
        System.out.println("Pre-increment (++a): " + (++a));
        System.out.println("Value of a after ++a: " + a);

        // Post-decrement
        System.out.println("Post-decrement (a--): " + (a--));
        System.out.println("Value of a after a--: " + a);

        // Pre-decrement
        System.out.println("Pre-decrement (--a): " + (--a));
        System.out.println("Value of a after --a: " + a);

        // Assignment operators
        a += 5;
        System.out.println("After a += 5: " + a);

        a -= 3;
        System.out.println("After a -= 3: " + a);

        // With other data types
        double d = 5.5;
        d++;
        d--;
        System.out.println("Double after ++ and --: " + d);

        char c = 'A';
        c++;
        c--;
        System.out.println("Char after ++ and --: " + c);
    }
  
}
