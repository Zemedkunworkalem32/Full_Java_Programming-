package university;

import java.io.*;
import java.util.ArrayList;

public class Student implements Serializable{
  int id;
  String name;
  String dept;
  String sect;
  int year;

    public Student() {
    }
  public Student(int id ,String name, String dept, String sect, int year){
    this.id =id;
    this.name = name;
    this.dept = dept;
    this.sect = sect;
    this.year = year;
  }
   @Override
  public String toString(){
    return id + " | " + name + " | " + dept + " | " + sect + " | " + year; 
  }

  public void addStudent(ArrayList<Student> std){
    try {
        try(FileOutputStream fos = new FileOutputStream("std.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos)){
        oos.writeObject(std);
        System.err.println("Students added successfully");
        }
    } catch (IOException e) {
      System.err.println("error: " + e.getMessage());
    }
    
  }

  public void showStudents() throws Exception{
    try {
        try(FileInputStream fis = new FileInputStream("std.txt");
         ObjectInputStream ois = new ObjectInputStream(fis)){

         ArrayList<Student> std = (ArrayList<Student>)ois.readObject();
         System.err.println("Students List");

         for(Student s : std){
          System.err.println(s);
         }
         fis.close();
         ois.close();

    } 
  }catch (IOException e) {
      System.err.println("error : "+ e.getMessage());
    }

  }
  
}
