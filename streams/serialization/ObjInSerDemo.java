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

public class ObjInSerDemo {
    public static void main(String[] args) {

        // Deserialize the student object from stud.txt
        try (FileInputStream fis = new FileInputStream("stud.txt");
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            Student s = (Student) ois.readObject();
            System.out.println("Deserialized Student Object:");
            System.out.println(s);

        } catch (FileNotFoundException e) {
            System.out.println("File not found! Run ObjOutputDemo first to create stud.txt");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Serialization Error: " + e.getMessage());
        }
    }
}