class WHiteBoard
{
  String text;
  int numberOfStudent = 0;
  int count = 0;

  public void attendnce()
  {
    numberOfStudent++;
  }
  synchronized public void write(String t)
  {
    System.out.println("Teacher is writing " + t);
    while(count != 0)
      try{
    wait();
    }catch(InterruptedException e)
    {
      e.printStackTrace();
    }
    text = t;
    count = numberOfStudent;
    notifyAll();
  }
  synchronized public String read()
  {
    while(count == 0)
      try {
          wait();
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
       String t = text;
       count--;
       notify();
       return t;
  }
}
class Teacher extends Thread
{
  WHiteBoard wb;
  String[] notes = {"Java is a language", "It is OOPs", "It is platform independent", "It supports Thread","end"};

    public Teacher(WHiteBoard w) {
      wb = w;
    }
    @Override
    public void run()
    {
      for(int i=0; i<notes.length; i++)
        wb.write(notes[i]);
    }
  
}
class Student extends Thread
{
  String name;
  WHiteBoard wb;

    public Student(String n, WHiteBoard w)
    {
      name = n;
      wb = w;
    }
    @Override
    public void run()
    {
      String text;
      wb.attendnce();
      do
      {
        text = wb.read();
        System.out.println(name + " is reading " + text);
        System.out.flush();

      }while(!text.equals("end"));
    }
  
}
public class Classroom {
  public static void main(String[] args) {
      WHiteBoard wb = new WHiteBoard();
      Teacher t = new Teacher(wb);

      Student s1 = new Student("1. John", wb);
      Student s2 = new Student("2. Smith", wb);
      Student s3 = new Student("3. Jonathan", wb);
      Student s4 = new Student("4. Chala", wb);

      t.start();
      s1.start();
      s2.start();
      s3.start();
      s4.start();
  }
  
}
