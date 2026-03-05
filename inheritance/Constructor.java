public class Constructor {
  public Constructor() {
    System.out.println("Constructor called!");
  }
  static class Child extends Constructor {
    public Child() {
      super();
      System.out.println("Child constructor called!");
    }
  }
  public static void main(String[] args) {
    Child child = new Child();
    // Use the child variable to avoid the warning
    System.out.println(child.getClass().getSimpleName() + " object created.");
  }

  
}
