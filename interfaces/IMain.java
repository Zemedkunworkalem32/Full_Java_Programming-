interface InterfacesPractice {
    void method1();
    void method2();
}

class ImplementationClass implements InterfacesPractice {
    @Override
    public void method1() {
        System.out.println("Method 1 implementation");
    }

    @Override
    public void method2() {
        System.out.println("Method 2 implementation");
    }
}

public class IMain {
    public static void main(String[] args) {
        ImplementationClass impl = new ImplementationClass();
        impl.method1();
        impl.method2();
    }
}