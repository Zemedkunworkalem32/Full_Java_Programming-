import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class Student {
    int rollno;
    String name;
    String dept;
}

public class DataStream {
    public static void main(String[] args) {

        try {
            try(FileOutputStream fos = new FileOutputStream("student.txt");
            DataOutputStream dos = new DataOutputStream(fos)){

            Student st = new Student();
            st.rollno = 10;
            st.name = "Kachinu";
            st.dept = "Software Engineering";

            dos.writeInt(st.rollno);
            dos.writeUTF(st.name);
            dos.writeUTF(st.dept);

            dos.close();
            fos.close();
            }

        } catch (FileNotFoundException e) {
             System.out.println("An error occurred: " + e.getMessage());
        } 
         catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
}
    }
}