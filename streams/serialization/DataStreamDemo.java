import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class Student {
    int rollno;
    String name;
    String dept;
}

public class DataStreamDemo {
    public static void main(String[] args) {

        try {
            try(FileInputStream fis = new FileInputStream("student.txt");
            DataInputStream dis = new DataInputStream(fis)){

            Student st = new Student();
            st.rollno = dis.readInt();
            st.name = dis.readUTF();
            st.dept = dis.readUTF();

            System.out.println("Roll numbers: " + st.rollno);
            System.out.println("name: " + st.name);
            System.out.println("departmet: " + st.dept);

            }

        } catch (FileNotFoundException e) {
             System.out.println("An error occurred: " + e.getMessage());
        } 
         catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
}
    }
}