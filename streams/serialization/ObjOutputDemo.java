import java.io.*;

class Student implements Serializable {
    int rollno;
    String name;
    String dept;
    float avg;
    public static int data = 10;
    public transient int t;

    public Student() {}

    public Student(int rn, String n, String dt, float a) {
        rollno = rn;
        name = n;
        dept = dt;
        avg = a;
        data = 500;
        t = 500;
    }

    @Override
    public String toString() {
        return """
                Student Details 
                Roll Number :""" + rollno +
                "\nName : " + name +
                "\nDepartment : " + dept +
                "\nAverage : " + avg +
                "\nData : " + data +
                "\nTransient : " + t;
    }
}

public class ObjOutputDemo {
    public static void main(String[] args) {

        Student s = new Student(20, "John", "Software Engineering", 87.3f);

        try (FileOutputStream fos = new FileOutputStream("stud.txt");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(s);
            System.out.println("Student object serialized to stud.txt");

        } catch (IOException e) {
            System.out.println("Serialization Error: " + e.getMessage());
        }
    }
}