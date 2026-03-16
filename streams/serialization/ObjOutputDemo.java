import java.io.*;

class Student implements Serializable {
    int rollno;
    String name;
    String dept;
    float avg;
    public static int data = 10;
    public transient int t;

    // default constructor
    public Student() {}

    // parameterized constructor
    public Student(int rn, String n, String dt, float a) {
        rollno = rn;
        name = n;
        dept = dt;
        avg = a;
        // proof that static and transient are not stored
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

        // Serialize the student object to stud.txt
        try (FileOutputStream fos = new FileOutputStream("stud.txt");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(s);
            System.out.println("Student object serialized to stud.txt");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}