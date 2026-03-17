import java.util.*;

public class LinkedListDemo {
  public static void main(String[] args) {
      LinkedList <Integer>  al1 = new LinkedList<>();
      LinkedList <Integer> al2 = new LinkedList<>(List.of(90,64,38,29,43,12,56,60));
      al1.add(67);
      al1.add(0, 23);
      al1.addAll(1, al2);
      System.out.println(al1);
      System.out.println(al1.get(4));
      System.out.println(al1.contains(90));
      System.out.println(al1.indexOf(56));
      al1.add(3,90);
      System.out.println(al1);
      System.out.println(al1.lastIndexOf(90));
      al1.set(0, 80);
      System.out.println(al1);
      System.out.println(al1.indexOf(90));

      //iteration through arraylist
      // System.out.print("[");
      // for(int i = 0; i < al1.size(); i++)
      //   System.out.print(+al1.get(i)+ ", ");
      // System.out.println("]");

      // for(Integer x:al1)
      //   System.out.println(x);
      // al1.forEach(n->System.out.println(n));
      // al1.forEach(System.out::println);
      // for(ListIterator <Integer> it = al1.listIterator();it.hasNext();)
      //   System.out.println(it.next());
      al1.addFirst(100);
      al1.addLast(200);
        al1.forEach(n->show(n));

  }
  static void show(int n)
  {
    if(n>50)
      System.out.println(n);
  }
  
}
