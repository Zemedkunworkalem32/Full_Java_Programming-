package university;

import java.io.*;
import java.util.ArrayList;

public class Teacher implements Serializable {
    private static final long serialVersionUID = 1L;

    int id;
    String name;
    String dept;

    public Teacher(int id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return id + " | " + name + " | " + dept;
    }

    // ✅ Save teachers
    public void addTeacher(ArrayList<Teacher> list) {
        try (FileOutputStream fos = new FileOutputStream("teachers.dat");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(list);
            System.out.println("Teachers saved successfully!");

        } catch (IOException e) {
            System.err.println("Error saving teachers: " + e.getMessage());
        }
    }

    // ✅ Show teachers
    public void showTeachers()throws IOException, ClassNotFoundException {
        try (FileInputStream fis = new FileInputStream("teachers.dat");
             ObjectInputStream ois = new ObjectInputStream(fis)) {

             ArrayList<Teacher> list =  (ArrayList<Teacher>) ois.readObject();

            System.out.println("\n--- Teacher List ---");
            for (Teacher t : list) {
                System.out.println(t);
            }

        } catch (Exception e) {
            System.err.println("Error showing teachers: " + e.getMessage());
        }
    }
}