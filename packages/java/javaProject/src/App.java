import java.util.ArrayList;

import university.Student;
import university.Teacher;

public class App {
    public static void main(String[] args) throws Exception {

        //  Students
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(12, "Zemedkun", "SWE", "D", 2018));
        students.add(new Student(13, "Bekele", "SWE", "D", 2018));
        students.add(new Student(14, "Debebe", "SWE", "D", 2018));

        Student st = new Student();
        st.addStudent(students);
        st.addStudentToDB(students);
        st.showStudents();
        st.showStudentsFromDB();

      //teachers 
        ArrayList<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher(2, "Abdu", "SWE"));
        teachers.add(new Teacher(3, "Kebede", "IT"));

        Teacher tc = new Teacher(0, "", "");
        tc.addTeacher(teachers);
        tc.addTeacherToDB(teachers);
        tc.showTeachers();
        tc.showTeacherFromDB();
    }
}