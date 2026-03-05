package app;

import model1.Student;
import model1.Calculator;
import model1.Car;

public class Main {
    public static void main(String[] args) {

        // Student object
        Student s1 = new Student("John", 20);
        s1.displayInfo();
        System.out.println("Is Adult: " + s1.isAdult());
        s1.study();

        System.out.println("----------------");

        // Calculator object
        Calculator calc = new Calculator();
        System.out.println("Addition: " + calc.add(5, 3));
        System.out.println("Multiplication: " + calc.multiply(4, 2));

        System.out.println("----------------");

        // Car object
        Car car = new Car("Toyota");
        car.displayBrand();
        car.accelerate(50);
        car.brake(20);
    }
}