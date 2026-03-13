class Mytread implements Runnable{
  @Override
  public void run(){
    int i = 1;
    while(true){
      System.out.println(i + "Hello!");
      i++;
    }
  }
}
public class TreadExample {

  public static void main(String[] args) {
      Mytread task = new Mytread();
      Thread t =new Thread(task);
      t.start();
      int i = 1;
      while (true) { 
          System.out.println(i +"Word.");
          i++;
      }
    }
  }
  

