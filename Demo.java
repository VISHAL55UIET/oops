public class Demo {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Vishal Singh";
        s1.age = 23;
        s1.rollNumber = 101;
        s1.college = "IIT Kanpur";

        s2.name = "Shivam Singh";
        s2.age = 23;
        s2.rollNumber = 102;
        s2.college = "IIT Kanpur";

        s1.markAttendance();
        s2.markAttendance();

        s1.print();
        s2.print();
    }
}

class Student {
    String name;
    int age;
    int rollNumber;
    String college;

    void markAttendance() {
        System.out.println("Attendance marked by " + name);
    }

    void print() {
        System.out.println(
            name + ", " + age + ", " + rollNumber + ", " + college
        );
    }
}