
import java.util.*;

class Point implements Comparable <Point>
{
  int x;
  int y;

  public Point(int x, int y)
  {
    this.x = x;
    this.y = y;
  }
  @Override
  public String toString()
  {
    return """
        X : %d,
        Y : %d
        """.formatted(x,y);
  }
  @Override
  public int compareTo(Point o)
  {
    Point p = (Point)o;
    if(x<p.x) return -1;
    else if(x>p.x) return 1;
    else{
      if(y<p.y) return -1;
      else if(y>p.y) return 1;
      else return 0;
    }
  }
}

public class SetDemo {
  public static void main(String[] args) {
      TreeSet <Point> ts = new TreeSet<>();
      ts.add(new Point(1,2));
      ts.add(new Point(3, 4));
      ts.add(new Point(6, 8));

      for(Point p :ts)
        System.out.println(p);
  }
}
