package demo;

public class Student extends Person{
    private String school;
    private String subjects;

    public Student(){

    }

    public Student(Student student){
        super(student);
        if(student!=null){
            this.school=student.school;
            this.subjects=student.subjects;
        }
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSubjects() {
        return subjects;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }

    @Override
    public Person clone() {
        return new Student(this);
    }

    @Override
    public String toString() {
        return super.toString() + "Student{" +
                "school='" + school + '\'' +
                ", subjects='" + subjects + '\'' +
                '}';
    }
}
