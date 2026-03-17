import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        set.add(100);
        set.add(50);
        set.add(150);
        set.add(50); // duplicate ignored

        for (Integer val : set) {
            System.out.println(val);
        }
    }
}