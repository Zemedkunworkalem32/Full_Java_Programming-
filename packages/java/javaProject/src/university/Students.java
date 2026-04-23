// package university;

// import java.io.FileInputStream;
// import java.io.FileOutputStream;
// import java.io.*;
// import java.io.ObjectInputStream;
// import java.io.ObjectOutputStream;
// import java.io.Serializable;
// import java.util.ArrayList;

// public class Students implements Serializable{
//   int id;
//   String name;
//   String dept;
//   String sect;
//   int year;

//     public Students() {
//     }
//   public Students(int id ,String name, String dept, String sect, int year){
//     this.id =id;
//     this.name = name;
//     this.dept = dept;
//     this.sect = sect;
//     this.year = year;
//   }

//   public String toString(ArrayList<Students> std){
//     return id + " | " + name + " | " + dept + " | " + sect + " | " + year; 
//   }

//   public void addStudent(ArrayList<Students> std){
//     try {
//         try(FileOutputStream fos = new FileOutputStream("std.txt");
//         ObjectOutputStream oos = new ObjectOutputStream(fos)){
//         oos.writeObject(std);
//         System.err.println("Students added successfully");
//         }
//     } catch (IOException e) {
//       System.err.println("error: " + e.getMessage());
//     }
    
//   }

//   public void showStudents(){
//     try {
//         try(FileInputStream fis = new FileInputStream("std.txt");
//          ObjectInputStream ois = new ObjectInputStream(fis)){

//          ArrayList<Students> std = (ArrayList<Students>)ois.readObject();
//          System.err.println("Students List");

//          for(Students s : std){
//           System.err.println(s);
//          }
//          fis.close();
//          ois.close();

//     } 
//   }catch (IOException e) {
//       System.err.println("error : "+ e.getMessage());
//     }

//   }
  
// }
