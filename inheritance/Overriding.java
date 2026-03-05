public class Overriding {

    public void display() {
        System.out.println("Display method in Parent class");
    }


    public static void main(String[] args) {

        // Parent object
        Overriding parent = new Overriding();
        parent.display();   // Calls Parent method

        // Child object
        Overriding child = new Child();  // Polymorphism
        child.display();   // Calls Child method
    }
}

// Child class
class Child extends Overriding {

    @Override
    public void display() {
        System.out.println("Display method in Child class");
    }
}