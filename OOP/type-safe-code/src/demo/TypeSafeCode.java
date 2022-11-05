package demo;

import java.util.*;

class Student{
    private String name;
    private String school;

    public Student(String name, String school) {
        this.name = name;
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", school='" + school + '\'' +
                '}';
    }
}

class A{

}
class B extends A{

}
class C extends B{

}

public class TypeSafeCode {

    public static void upperBoundTest(List<? extends B> list){}

    public static void lowerBoundTest(List<? super B> list){}

    public static void main(String[] args) {
        List<A> list=new ArrayList<>();
        lowerBoundTest(list);

        List<? extends B> list1=new ArrayList<>();
        List<? super B> list2=new ArrayList<>();
        list2.add(new C());


        List<Integer> al=new ArrayList<>();
        al.add(4);
        al.add(5);
        al.add(7);
        //al.add("Hello");

        Object[] objects=new Integer[3];

        List<Student> students=List.of(
                new Student("Thaw Thaw","Info"),
                new Student("John Doe","Gusto"),
                new Student("Harry","Harvest")
        );

        List<String> sl= Arrays.asList("Hello", "Java", "Is", "Cool");

        // print(students);
        printCollection(students);
        // upper bound, extends
        // lower bound, super

    }

    public static void printCollection(List<?> list){
        for(Object o:list){
            System.out.println(o);
        }
    }

    private static <T> void print(List<T> al) {
        Iterator<T> itr= al.iterator();
        while(itr.hasNext()){
            T num=itr.next();
            System.out.println(num);
        }
    }
}
