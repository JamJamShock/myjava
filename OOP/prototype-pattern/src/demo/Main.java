package demo;

public class Main {
    public static void main(String[] args) {
        Student student=new Student();
        student.setPersonId(123);
        student.setSchool("ISM");
        student.setSubjects("Java");
        student.setAddress("Dream Land");
        student.setAge(23);
        student.setName("John Doe");

        Student cloneStudent=(Student) student.clone();

        student.setName("John William");

        Student cloneStudent2=(Student) student.clone();

        System.out.println(cloneStudent);
        System.out.println(cloneStudent2);

        boolean test=cloneStudent.equals(cloneStudent2);
        System.out.println("Clone are the same : "+test);

    }
}
