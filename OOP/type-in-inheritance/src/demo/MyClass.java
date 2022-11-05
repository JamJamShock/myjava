package demo;

class Person{

}

class Student extends Person{
    public void doSomething(){
        System.out.println("do something!");
    }
}

class JavaStudent extends Student{

}

class JavaInternationalStudent extends JavaStudent{

}

public class MyClass {
    public static void main(String[] args) {
        /*Person obj=new Person();

        boolean test=obj instanceof JavaStudent;

        System.out.println(test);*/

        doSomething(new Student());

    }

    public static void doSomething(Person person){
        if(person instanceof Student){
            ((Student)person).doSomething();
        }else {
            System.out.println("Wrong oject!");
        }
    }
}
