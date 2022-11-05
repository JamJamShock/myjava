package demo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Student Counts:"
        + Student.countStudentsNumber());
        Student s1=
                new Student("John Doe", 22, "ISM");
        Student s2=
                new Student("John William", 23, "ISM");
        Student s3=
                new Student("Thomas Hardy", 24, "YIS");
        System.out.println(s2.studentInfo());
        System.out.println("Student Counts:"
        +Student.countStudentsNumber());
    }
}
