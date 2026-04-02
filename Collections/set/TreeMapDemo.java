import java.util.*;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>(Map.of(
            1,"D",
            2,"B",
            3,"C",
            4, "E",
            5, "G"
        ));

        System.out.println(tm);
    }
}