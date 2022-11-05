package demo;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class Main {

    public static void main(String[] args) {
        /*int result=sumStream(List.of(8,9,10,11,12,13));
        System.out.println(result);*/

        Stream<Integer> intStream= Stream.of(1,2,3,4,5,6,7,8,9);

        intStream
                .filter(i -> i % 2 == 0)
                .map(a -> a * a)
                .limit(3)
                .forEach(a -> System.out.print(a + " "));

        List.of(
                new Student("Marry",23),
                new Student("Moe",20),
                new Student("Bob",21),
                new Student("Harry",23)
        ).stream()
                .map(Student::getName)
                .filter(s -> s.startsWith("M"))
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }

    public static int sumStream(List<Integer> list){
        return list.stream()
                .filter(a -> {
                    return a > 10;
                }).mapToInt(i ->{
                       return i;
                }).sum();
    }

    public static int sum(List<Integer> list){
        int sum=0;
        Iterator<Integer> itr=list.iterator();
        while (itr.hasNext()){
            int num=itr.next();
            if(num>10){
                sum +=num;
            }
        }
        return sum;
    }
}
