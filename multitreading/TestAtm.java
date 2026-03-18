import java.util.concurrent.TimeUnit;
class ATM {

    public void useATM(String name, double amount) {

        // Non-critical delay (outside lock)
        try {
            Thread.sleep(200); 
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }

        synchronized (this) {
            System.out.print(name + " checking ");
            System.out.println("Balance");

            try {
                TimeUnit.MILLISECONDS.sleep(500); // inside but necessary for simulation
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }

            System.out.print(name + " withdrawing ");
            System.out.println(amount);
        }
    }
}

class Customer extends Thread {
    final private String name;
    final private double amount;
    final private ATM atm;

    public Customer(String n, ATM at, double amt) {
        name = n;
        atm = at;
        amount = amt;
    }

    @Override
    public void run() {
        atm.useATM(name, amount);
    }
}

public class TestAtm {
    public static void main(String[] args) {

        ATM atm = new ATM();

        Customer c1 = new Customer("Smith", atm, 200);
        Customer c2 = new Customer("John", atm, 500);

        c1.start();
        c2.start();
    }
}