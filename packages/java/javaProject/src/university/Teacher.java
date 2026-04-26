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

    //  Save teachers
    public void addTeacher(ArrayList<Teacher> list) {
        try (FileOutputStream fos = new FileOutputStream("teachers.txt");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(list);
            System.out.println("Teachers saved successfully!");

        } catch (IOException e) {
            System.err.println("Error saving teachers: " + e.getMessage());
        }
    }

    //  Show teachers
    public void showTeachers()throws IOException, ClassNotFoundException {
        try (FileInputStream fis = new FileInputStream("teachers.txt");
             ObjectInputStream ois = new ObjectInputStream(fis)) {

              @SuppressWarnings("unchecked")
                ArrayList<Teacher> list =  (ArrayList<Teacher>) ois.readObject();

            System.out.println("\n--- Teacher List ---");
            for (Teacher t : list) {
                System.out.println(t);
            }

        } catch (Exception e) {
            System.err.println("Error showing teachers: " + e.getMessage());
        }
    }
    // Fix this method in Teacher.java:
public void addTeacherToDB(ArrayList<Teacher> teacher) {
    // CORRECTED SQL syntax
    String sql = "INSERT INTO teacher (id, name, dept) VALUES (?, ?, ?)";
    
    try (Connection con = DBConnection.getConnection()) {
        if (con == null) {
            System.err.println("No database connection available");
            return;
        }
        
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            for (Teacher t : teacher) {
                ps.setInt(1, t.id);
                ps.setString(2, t.name);
                ps.setString(3, t.dept);
                ps.addBatch();  // Use batch for multiple inserts
            }
            ps.executeBatch();
            System.out.println("✓ Teachers saved to the database successfully");
        }
    } catch (Exception e) {
        System.err.println("DB Error: " + e.getMessage());
    }
}

// Fix showTeacherFromDB method (remove spaces from column names):
public void showTeacherFromDB() {
    String sql = "SELECT * FROM teacher";
    try (Connection con = DBConnection.getConnection()) {
        if (con == null) {
            System.err.println("No database connection available");
            return;
        }
        
        try (Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            
            System.out.println("\n--- Teachers from Database ---");
            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " | " +      // Removed space after "id"
                    rs.getString("name") + " | " +  // Removed space after "name"
                    rs.getString("dept")
                );
            }
        }
    } catch (Exception e) {
        System.err.println("DB Error: " + e.getMessage());
        e.printStackTrace();
    }
}
}