
class MyData
{
    int value;
    boolean flag = true;
   synchronized  public void set(int v)
      {
        while(flag!=true)
          try{
        wait();
      } catch(InterruptedException e){
        e.printStackTrace();
        }
        value = v;
        flag = false;
        notifyAll();
      }
   synchronized public int get()
      {
        int x = 0;
        while(flag != false)
          try{
        wait();
      }catch(InterruptedException e){
        e.printStackTrace();
      }
        x = value;
        flag = true;
        notifyAll();
        return x;
      }
}

class Producer extends Thread
{
  MyData data;
  public Producer(MyData d)
  {
    data = d;
  } 
  @Override
  public void run(){
    int counter = 1;
    while(true)
    {
      data.set(counter);
      System.out.println("producer: " + counter);
      counter++;
      try {
          Thread.sleep(500);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

class Consumer extends Thread
{
  MyData data;
  public Consumer(MyData d)
  {
    data = d;
  } 
  @Override
  public void run(){
    int value;
    while(true)
    {
      value = data.get();
    System.out.println("Consumer consumed: " + value);

    try {
        Thread.sleep(500);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
}
public class InterProcess {
  public static void main(String[] args) {
      MyData dat = new MyData();
      Producer p = new Producer(dat);
      Consumer c = new Consumer(dat);

      p.start();
      c.start();
  }
  
}
