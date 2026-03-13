
public class ThreadTest extends Thread
{
  @Override
  public void run(){
    int i = 1;
    while (true) { 
        System.out.println(i + " Hello");
        i++;
    }
  }
  public static void main(String[] args) {
      ThreadTest tt = new ThreadTest();
      tt.start();

      int i = 1;
      while(true){
        System.out.println(i + " World.");
        i++;
      }
  }
  }
  