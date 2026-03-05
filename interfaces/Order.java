interface Member {
  public void callback();
  
}
class Store{
  Member mem[] = new Member[100];
  int count = 0;

  public void register(Member m) {
    if(count < mem.length) {
      mem[count] = m;
      count++;
    }
  }
  public void inviteScale() {
    for(int i = 0; i < count; i++) {
      mem[i].callback();
    }
  }

}
class Customer implements Member {
  String name;

  public Customer(String name) {
    this.name = name;
  }

  @Override
  public void callback() {
    System.out.println(name + " has been invited to the scale.");
  }
}

public class Order {
  public static void main(String[] args) {
    Store store = new Store();
    Customer c1 = new Customer("Alice");
    Customer c2 = new Customer("Bob");
    Customer c3 = new Customer("Charlie");

    store.register(c1);
    store.register(c2);
    store.register(c3);

    store.inviteScale();
  }
}