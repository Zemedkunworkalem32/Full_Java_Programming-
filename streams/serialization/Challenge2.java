
import java.io.*;

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

public class Challenge2 {
  public static void main(String[] args) {
      Customer list[] = {new Customer("Abdi", "+251992939495"), 
                        new Customer("Tesfa","+251910235476"),
                        new Customer("Yohannes","+25183497585"),
                        new Customer("Tolessa", "+251978654334"),
                        new Customer("Bontu","+251967543927")};
      try {
        try(FileOutputStream fos = new FileOutputStream("customer.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos)){

        oos.writeInt(list.length);

        for(Customer c :list)
          oos.writeObject(c);
        System.out.println("Customer object is written successfully to the customer file.");
        oos.close();
        fos.close();
     }

          
      } catch (Exception e) {
        e.printStackTrace();
      }
  }
}

