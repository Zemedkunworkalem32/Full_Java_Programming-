class ATM {
 synchronized public void checkBalance(String name)
  {
    System.out.print(name + " checking ");
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println(" Balance");

  }
  synchronized public void withdraw(String name, double amount)
  {
    System.out.print(name + " withdrawing ");

    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println(amount);
  }
  
}
class Customer extends Thread
{
  String name;
  double amount;
  ATM atm;

    public Customer(String n, ATM at, double amt)
     {
      name = n;
      atm = at;
      amount = amt;
    }
    public void useATM()
    {
      atm.checkBalance(name);
      atm.withdraw(name, amount);
    }
    @Override
    public void run()
    {
      useATM();
    }
  
}
public class TestAtm
{
  public static void main(String[] args) {
      ATM atm = new ATM();
      Customer c1 = new Customer("smith", atm, 200);
      Customer c2 = new Customer("John", atm, 500);
      c1.start();
      c2.start();
  }
}