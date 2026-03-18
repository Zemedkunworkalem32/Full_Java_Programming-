import java.util.*;

public class ComparatorDemo {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        int b[] = {1,2,3,4,5,6,7,8,9,10,11};

        System.out.println("Array a:");
        for(int x : a)
            System.out.println(x);

        System.out.println("Array b:");
        for(int x : b)
            System.out.println(x);

        int c[] = Arrays.copyOf(a, 6); // first 6 elements of a
        Arrays.sort(c);

        System.out.println("Array c (copied and sorted):");
        for(int x : c)
            System.out.println(x);
    }
}