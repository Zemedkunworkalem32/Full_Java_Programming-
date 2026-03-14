import java.io.*;
class Producer extends Thread
{
  OutputStream os;
  public Producer(OutputStream o)
  {
    os = o;
  }
  @Override
  public  void run()
  {
    int count = 1;
    while(true)
    {
      try {
        os.write(count);  
        os.flush();

        System.out.println("producer is prodiced :" + count);
        System.out.flush();
        Thread.sleep(1000);
          count++;
      } catch (Exception e) {}
    
    }
  }
 
}

class Consumer extends Thread
{
  InputStream is;
  public Consumer(InputStream s)
  {
    is = s;
  }
  @Override
  public  void run()
  {
    int x;
    while(true)
    {
      try {
        x = is.read();

        System.out.println("Consumer is consuming :" + x);
        System.out.flush();
        Thread.sleep(1000);
      } catch (Exception e) {}
    
    }
  }
 
}

public class Pipeddemo {
  public static void main(String[] args) throws Exception
   {
      PipedInputStream pis = new PipedInputStream();
      PipedOutputStream pos = new PipedOutputStream();

      pis.connect(pos);
      Producer p = new Producer(pos);
      Consumer c = new Consumer(pis);

      p.start();
      c.start();

  }
  
}
