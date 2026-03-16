import java.io.*;
class Student 
{
  int rollno;
  String name;
  String dept;
}
public class StreamReader {
    public static void main(String[] args) throws Exception
  {
    FileInputStream fis = new FileInputStream("students.txt");
    BufferedReader br = new BufferedReader(new InputStreamReader(fis) );

    Student s = new Student();
    s.rollno = Integer.parseInt(br.readLine());
    s.name = br.readLine();
    s.dept = br.readLine();

    System.out.println("Rollno :" + s.rollno);
    System.out.println("name :" + s.name);
    System.out.println("Department :" + s.dept);

    br.close();
    fis.close();

  }
  
}
