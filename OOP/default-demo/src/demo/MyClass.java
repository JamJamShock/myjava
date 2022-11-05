package demo;

public class MyClass implements MyInterface1,MyInterface2 {

    public MyClass(){
        test();
    }

    public void test(){
        System.out.println("MyClass :: test");
    }

    public static void main(String[] args) {
        new MyClass();
    }
}
