import java.io.*;
public class Files {
  public static void main(String[] args)throws Exception
   {
      File f = new File("C:\\Users\\HELLO\\Desktop\\Java_Programming\\streams");
      System.out.println(f.isDirectory());
      // String list[] = f.list();
      // for(String x : list)
      // {
      //   System.out.println(x);
      // }
      File lists[] = f.listFiles();
      for(File x : lists)
      {
        System.out.print(x.getName());
        // System.out.println(" " +x.getPath());
        System.out.println(" " +x.getParent());
      }
  }
  
}
