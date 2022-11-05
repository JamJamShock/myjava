package demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Student> students=
                Arrays.asList(
                        new Student("Thaw Thaw",23),
                        new Student("Thuza New",22),
                        new Student("Kyaw Gyi",22),
                        new Student("Gaung Gyi",22)
                );
        Comparator<Student> comparator=new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getName().compareTo(s2.getName());
            }
        };
        Collections.sort(students,(a,b)->a.getName().compareTo(b.getName()));

        System.out.println(students);
    }
}
