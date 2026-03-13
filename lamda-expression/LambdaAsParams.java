interface Mylambda {
  void display();
}
class UseLambda {
  public void callLambda(Mylambda mylambda) {
    mylambda.display();
  }
  
}

class Demo {
  public void show() {
    UseLambda useLambda = new UseLambda();
    // Using lambda expression to create a Mylambda instance and passing it as a parameter
    useLambda.callLambda(() -> System.out.println("Hello from the lambda expression passed as a parameter!"));
  }
}

public class LambdaAsParams {
  public static void main(String[] args) {
    Demo demo = new Demo();
    demo.show();
  }
  
}
