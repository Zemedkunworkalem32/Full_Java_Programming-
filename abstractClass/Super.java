abstract class Super {

    public Super() {
        System.out.println("Super constructor called!");
    }

    public void display() {
        System.out.println("Display method in Super class");
    }

    public abstract void meth1();
}

class Sub extends Super {

    @Override
    public void meth1() {
        System.out.println("Implementation of abstract method in Sub class");
    }

    public static void main(String[] args) {
        Sub sub = new Sub();

        sub.display();  // method from Super
        sub.meth1();    // implemented method
    }
}