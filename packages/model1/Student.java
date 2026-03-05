package model1;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public boolean isAdult() {
        return age >= 18;
    }

    public void study() {
        System.out.println(name + " is studying.");
    }
}