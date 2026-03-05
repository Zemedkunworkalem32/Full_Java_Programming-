package model1;

public class Car {
    private String brand;
    private int speed;

    public Car(String brand) {
        this.brand = brand;
        this.speed = 0;
    }

    public void accelerate(int increment) {
        speed += increment;
        System.out.println("Speed increased to " + speed);
    }

    public void brake(int decrement) {
        speed -= decrement;
        if (speed < 0) speed = 0;
        System.out.println("Speed decreased to " + speed);
    }

    public void displayBrand() {
        System.out.println("Car brand: " + brand);
    }
}