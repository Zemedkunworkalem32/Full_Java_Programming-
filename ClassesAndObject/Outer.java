public class Outer {
  private int outerData = 10;

  class Inner {
    int innerData = 20;
    public void display() {
      System.out.println("Outer data: " + outerData);
      System.out.println("Inner data: " + innerData);
    }
  }

  public void createInner() {
    Inner inner = new Inner();
    inner.display();
  }

  public static void main(String[] args) {
    Outer outer = new Outer();
    outer.createInner();
  }  
  
}
