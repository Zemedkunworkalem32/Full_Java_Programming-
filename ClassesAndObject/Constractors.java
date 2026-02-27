public class Constractors {
    String name;
    int age;
    String grade;

    // Constructor to initialize student details
    Constractors(String name, int age, String grade) {
        this.name = name;
        this.age = age; 
        this.grade = grade;
    }

    public static void main(String[] args) {
        Constractors student1 = new Constractors("Alice", 20, "A");
        Constractors student2 = new Constractors("Bob", 22, "B");

        System.out.println("Student 1: " + student1.name + ", Age: " + student1.age + ", Grade: " + student1.grade);
        System.out.println("Student 2: " + student2.name + ", Age: " + student2.age + ", Grade: " + student2.grade);
    }
  
}
