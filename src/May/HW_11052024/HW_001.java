package May.HW_11052024;
class Attribute {
    String name;
    int age;

    Attribute(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Behav {
    String grade;

    Behav(String grade) {
        this.grade = grade;
    }
}

class Course {
    String courseName;
    String instructor;

    Course(String courseName, String instructor) {
        this.courseName = courseName;
        this.instructor = instructor;
    }
}

class Student {
    int studentId;
    Attribute attribute;
    Behav behavior;
    Course[] coursesTaken;

    Student(int studentId, Attribute attribute, Behav behavior, Course[] coursesTaken) {
        this.studentId = studentId;
        this.attribute = attribute;
        this.behavior = behavior;
        this.coursesTaken = coursesTaken;
    }
}

class Payment {
    int studentId;
    double amount;

    Payment(int studentId, double amount) {
        this.studentId = studentId;
        this.amount = amount;
    }
}

public class HW_001 {
    public static void main(String[] args) {
        // Create Attribute objects for students
        Attribute attr1 = new Attribute("John Doe", 20);
        Attribute attr2 = new Attribute("Alice Smith", 21);
        Attribute attr3 = new Attribute("Bob Johnson", 22);

        // Create Behav objects for students
        Behav behav1 = new Behav("A");
        Behav behav2 = new Behav("B");
        Behav behav3 = new Behav("C");

        // Create Course objects
        Course course1 = new Course("Mathematics", "Professor X");
        Course course2 = new Course("Physics", "Professor Y");
        Course course3 = new Course("Biology", "Professor Z");

        // Create Student objects and assign values
        Student student1 = new Student(1, attr1, behav1, new Course[]{course1, course2});
        Student student2 = new Student(2, attr2, behav2, new Course[]{course2, course3});
        Student student3 = new Student(3, attr3, behav3, new Course[]{course1, course3});

        // Create Payment objects for students
        Payment payment1 = new Payment(1, 1000);
        Payment payment2 = new Payment(2, 1500);
        Payment payment3 = new Payment(3, 800);
    }
}