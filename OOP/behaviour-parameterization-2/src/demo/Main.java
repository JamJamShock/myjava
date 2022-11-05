package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<Student> students= List.of(
                new Student("Harry",23,"Gusto"),
                new Student("Bob",23,"Info"),
                new Student("Thomas",23,"ISY"),
                new Student("John",23,"YSI")
        );
        students
                .stream()
                        .map(s -> {
                            s.setName(s.getName().toLowerCase());
                            return s;
                        })
                                .forEach(System.out::println);

        /*change(students, s -> {
            s.setName(s.getName().toUpperCase());
            s.setSchool("ISM");
            return s;
        }).forEach(System.out::println);*/
    }

    public static List<Student> change(List<Student> list, Function<Student,Student> f){
        List<Student> myList=new ArrayList<>();

        for(Student s:list){
            myList.add(f.apply(s));
        }

        return myList;
    }
}
