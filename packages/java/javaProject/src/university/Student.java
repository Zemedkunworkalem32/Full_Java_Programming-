package university;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private String name;
    private String dept;
    private String sect;
    private int year;

    public Student() {}

    public Student(int id, String name, String dept, String sect, int year) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.sect = sect;
        this.year = year;
    }

    @Override
    public String toString() {
        return id + " | " + name + " | " + dept + " | " + sect + " | " + year;
    }

    // Save students to file (serialization)
    public void addStudent(ArrayList<Student> std) {
        try (FileOutputStream fos = new FileOutputStream("students.txt");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(std);
            System.out.println("Students added successfully");

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    // Read students from file
    public void showStudents() {
        try (FileInputStream fis = new FileInputStream("students.txt");
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            @SuppressWarnings("unchecked")
            ArrayList<Student> std = (ArrayList<Student>) ois.readObject();

            System.out.println("Students List:");
            for (Student s : std) {
                System.out.println(s);
            }

        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    // Save students to database
    // Update addStudentToDB method in Student.java:
public void addStudentToDB(ArrayList<Student> std) {
    String sql = "INSERT INTO student (id, name, dept, sect, year) VALUES (?, ?, ?, ?, ?)";

    try (Connection con = DBConnection.getConnection()) {
        if (con == null) {
            System.err.println("No database connection - skipping DB save");
            return;
        }
        
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            for (Student s : std) {
                ps.setInt(1, s.id);
                ps.setString(2, s.name);
                ps.setString(3, s.dept);
                ps.setString(4, s.sect);
                ps.setInt(5, s.year);
                ps.addBatch();
            }
            ps.executeBatch();
            System.out.println("✓ Students saved to the database");
        }
    } catch (Exception e) {
        System.err.println("DB error: " + e.getMessage());
    }
}

// Update showStudentsFromDB method:
public void showStudentsFromDB() {
    String sql = "SELECT * FROM student";

    try (Connection con = DBConnection.getConnection()) {
        if (con == null) {
            System.err.println("No database connection - cannot fetch students");
            return;
        }
        
        try (Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            System.out.println("\n--- Students from Database ---");
            boolean hasData = false;
            while (rs.next()) {
                hasData = true;
                System.out.println(
                    rs.getInt("id") + " | " +
                    rs.getString("name") + " | " +
                    rs.getString("dept") + " | " +
                    rs.getString("sect") + " | " +
                    rs.getInt("year")
                );
            }
            if (!hasData) {
                System.out.println("No students found in database");
            }
        }
    } catch (Exception e) {
        System.err.println("DB error: " + e.getMessage());
    }
}
}