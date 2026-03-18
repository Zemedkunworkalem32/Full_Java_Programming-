import java.time.Year;

public class Students {

    final private String name;
    final private String rollNo;
    private static int count = 1;

    private String assignRollNo() {
        int year = Year.now().getValue();
        String rolno = "Univ_" + year + "_" + count;
        count++;
        return rolno;
    }

    public Students(String name) {
        this.name = name;
        this.rollNo = assignRollNo();
        System.out.println("Student Name: " + name + ", Roll No: " + rollNo);
    }

    public String getRollNo() {
        return rollNo;
    }

    public static void main(String[] args) {
        Students student1 = new Students("Alice");
        Students student2 = new Students("Bob");
        Students student3 = new Students("Charlie");

        System.out.println(student1.name + " " + student1.rollNo);
        System.out.println(student2.name + " " + student2.rollNo);
        System.out.println(student3.name + " " + student3.rollNo);
    }
}