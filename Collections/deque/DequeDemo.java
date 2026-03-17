import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {
  public static void main(String[] args) {
    Deque<Integer> dp = new ArrayDeque<>();
    dp.offer(10);
    dp.offer(50);
    dp.offer(60);
    dp.offer(70);
    dp.offer(80);
    dp.offer(90);
    // dp.forEach((x)->System.out.println(x));
    dp.offerFirst(4);
    dp.offerFirst(3);
    dp.offerFirst(2);
    dp.offerFirst(1);   
    dp.pollLast();   
    // dp.forEach((x)->System.out.println(x));
    dp.pollFirst();
    dp.forEach((x)->System.out.println(x));

  }
  
}
