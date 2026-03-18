class WhiteBoard {
    String text;
    int numberOfStudents = 0;
    int count = 0;

    synchronized public void attendance() {
        numberOfStudents++;
    }

    synchronized public void write(String t) {
        while (count != 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Teacher is writing: " + t);
        this.text = t;
        this.count = numberOfStudents;
        notifyAll();
    }

    synchronized public String read() {
        while (count == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        String t = text;
        count--;
        if (count == 0) notifyAll(); // Wake up teacher only when last student is done
        return t;
    }
}

class Teacher extends Thread {
    WhiteBoard wb;
    String[] notes = {"Java is a language", "It is OOPs", "It is platform independent", "It supports Thread", "end"};

    public Teacher(WhiteBoard w) {
        this.wb = w;
    }

    @Override
    public void run() {
        for (String note : notes) {
            wb.write(note);
        }
    }
}

class Student extends Thread {
    String studentName; // Renamed to avoid confusion with Thread.name
    WhiteBoard wb;

    public Student(String n, WhiteBoard w) {
        this.studentName = n;
        this.wb = w;
    }

    @Override
    public void run() {
        String text; // Declared OUTSIDE the loop so it's visible to the 'while' condition
        wb.attendance();
        
        do {
            text = wb.read(); // Assign the value inside the loop
            System.out.println(studentName + " is reading: " + text);
        } while (!text.equals("end")); // 'text' is now visible here!
    }
}

public class Classroom {
    public static void main(String[] args) {
        WhiteBoard wb = new WhiteBoard();
        
        Student s1 = new Student("1. John", wb);
        Student s2 = new Student("2. Smith", wb);
        Student s3 = new Student("3. Jonathan", wb);
        Student s4 = new Student("4. Chala", wb);

        s1.start();
        s2.start();
        s3.start();
        s4.start();

        try { Thread.sleep(100); } catch (InterruptedException e) {}

        Teacher t = new Teacher(wb);
        t.start();
    }
}