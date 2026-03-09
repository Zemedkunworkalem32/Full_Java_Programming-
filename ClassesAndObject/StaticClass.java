public class StaticClass {
  static long price = 1000;

    static public void display() {
      System.out.println("Price inside static method: " + price);
    }
     void show(){
      System.out.println(" the price from non static method: " + price);
     }
  public static void main(String[] args) {
    StaticClass.display();
    StaticClass staticClass = new StaticClass();
    staticClass.show();
  }
}
