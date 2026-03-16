
import java.io.*;
import java.util.Scanner;

class Customer implements Serializable
{
  String CusId;
  String name;
  String phoneNo;
  static int count = 1;

    public Customer() {
    }

  public Customer(String n, String pn)
  {
    CusId = "C" + count;
    count++;
    name = n;
    phoneNo = pn;
  }

  @Override
  public String toString()
  {
    return """
        Customer Details!
        CustomerID : %s
        Customer name : %s
        Customer phone no. : %s
        """.formatted(CusId, name, phoneNo);
  }
}

public class ReadingCustomer {
  public static void main(String[] args) {
      
      try {
        try(
          java.util.Scanner sc = new Scanner(System.in);
          FileInputStream fis = new FileInputStream("customer.txt");
        ObjectInputStream ois = new ObjectInputStream(fis)){

       int length = ois.readInt();
       Customer list[] = new Customer[length];

        for(int i = 0; i<length; i++)
        {
          list[i] = (Customer)ois.readObject();
        }
        System.out.println("Enter name of customer :");
        String name =sc.nextLine();

        boolean found = false;
        for(Customer c :list)
        {
          if(name.equalsIgnoreCase(c.name)){
            System.out.println(c);
            found = true;
            break;
          }
        }
        if(!found)
        {
          System.out.println("Customer not found!");
        }
        ois.close();
        fis.close();
     }

          
      } catch (Exception e) {
        e.printStackTrace();
      }
  }
}

