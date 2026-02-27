public class Student {
    String name;
    int age;
    String grade;
    int rollNumber;
    String course;
    String university;
    String email;
    String phoneNumber;
    float attendancePercentage;
    String address;
    String parentName;
    String parentContact;
    String extracurricularActivities;
    String hobbies;
    String skills;
    String languagesKnown;
    String dateOfBirth;
    String gender;
    String bloodGroup;
    String nationality;
    String studentID;
    String enrollmentDate;
    String graduationDate;
    String currentStatus;
    String deparment;
    String yearOfStudy; 

    // Constructor to initialize student details
    Student(String name, int age, String grade, int rollNumber, String course, String university, String email,
            String phoneNumber, float attendancePercentage, String address, String parentName, String parentContact,
            String extracurricularActivities, String hobbies, String skills, String languagesKnown,
            String dateOfBirth, String gender, String bloodGroup, String nationality, String studentID, String enrollmentDate, String graduationDate, String currentStatus, String deparment, String yearOfStudy) {
        this.name = name;
        this.age = age; 
        this.grade = grade;
        this.rollNumber = rollNumber;
        this.course = course;
        this.university = university;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.attendancePercentage = attendancePercentage;
        this.address = address;
        this.parentName = parentName;
        this.parentContact = parentContact;
        this.extracurricularActivities = extracurricularActivities;
        this.hobbies = hobbies;
        this.skills = skills;
        this.languagesKnown = languagesKnown;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.bloodGroup = bloodGroup;
        this.nationality = nationality;
        this.studentID = studentID;
        this.enrollmentDate = enrollmentDate;
        this.graduationDate = graduationDate;
        this.currentStatus = currentStatus; 
        this.deparment = deparment; 
        this.yearOfStudy = yearOfStudy;

    }
    // Method to display student details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Course: " + course);
        System.out.println("University: " + university);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Attendance Percentage: " + attendancePercentage);
        System.out.println("Address: " + address);
        System.out.println("Parent Name: " + parentName);
        System.out.println("Parent Contact: " + parentContact);
        System.out.println("Extracurricular Activities: " + extracurricularActivities);
        System.out.println("Hobbies: " + hobbies);
        System.out.println("Skills: " + skills);
        System.out.println("Languages Known: " + languagesKnown);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Gender: " + gender);
        System.out.println("Blood Group: " + bloodGroup);   
        System.out.println("Nationality: " + nationality);
        System.out.println("Student ID: " + studentID);
        System.out.println("Enrollment Date: " + enrollmentDate);
        System.out.println("Graduation Date: " + graduationDate);
        System.out.println("Current Status: " + currentStatus);
        System.out.println("Department: " + deparment);
        System.out.println("Year of Study: " + yearOfStudy);
    }

        public static void main(String[] args) {
        Student student1 = new Student("Alice", 20, "A", 101, "Computer Science", "XYZ University", "alice@example.com",
                "1234567890", 95.5f, "123 Main St", "Bob", "0987654321", "Basketball, Music", "Reading, Traveling",
                "Programming, Communication", "English, Spanish", "01/01/2004", "Female", "O+", "American", "S12345", "01/09/2022", "30/06/2026", "Active", "Computer Science", "2nd Year");
        student1.displayDetails();  
        
       
    }
  
}
