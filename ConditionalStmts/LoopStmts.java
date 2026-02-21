public class LoopStmts {
  public static void main(String[] args) {

        // WHILE LOOP
        System.out.println("While Loop:");
        int i = 1;
        while (i <= 3) {
            System.out.println("i = " + i);
            i++;
        }

        // DO-WHILE LOOP
        System.out.println("\nDo-While Loop:");
        int j = 1;
        do {
            System.out.println("j = " + j);
            j++;
        } while (j <= 3);

        // FOR LOOP
        System.out.println("\nFor Loop:");
        for (int k = 1; k <= 3; k++) {
            System.out.println("k = " + k);
        }
    }
  
}
