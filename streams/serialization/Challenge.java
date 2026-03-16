import java.io.*;

public class Challenge {
  public static void main(String[] args) {
      try{
        float list[] = {6.4f,12.3f, 45.7f, 78.8f, 89.07f};
        try(FileOutputStream fos = new FileOutputStream("list.txt");
        DataOutputStream dos = new DataOutputStream(fos)){

        dos.writeInt(list.length);
        for(float f :list)
        {
          dos.writeFloat(f);
        }

        dos.close();
        fos.close();
      }
      }catch(Exception e){e.printStackTrace();}

      try {
      try(FileInputStream fis = new FileInputStream("list.txt");
      DataInputStream dis = new DataInputStream(fis)){

      int length = dis.readInt();
      float data;

      for(int i = 0; i<length; i++)
      {
        data = dis.readFloat();
        System.out.println(data);
      }
      dis.close();
      fis.close();
    }
      }catch(Exception e){e.printStackTrace();}
  }
  
}
