
import java.util.Comparator;
import java.util.PriorityQueue;
class MyCom implements Comparator<Integer>
{
  @Override
   public int compare(Integer o1, Integer o2)
   {
    if(o1<o2)return 1;
    if(o1>o2)return -1;
    return 0;

   }
}
public class PriorityQuequeDemo {
  public static void main(String[] args) {
      PriorityQueue <Integer> pq = new PriorityQueue<>(new MyCom());
      pq.add(8);
      pq.add(89);
      pq.add(12);
      pq.add(90);
      // pq.forEach((x)->System.out.println(x));
      // pq.poll();
      pq.add(30);
      pq.add(40);
      pq.add(60);
      pq.add(10);
      pq.add(20);
     while(!pq.isEmpty()){
    System.out.println(pq.poll());
    }
  }
  
}
