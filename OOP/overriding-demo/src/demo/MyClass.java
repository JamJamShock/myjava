package demo;

class Parent{
    int num=10;

    Parent(){
        test();
    }

    public void test(){
        System.out.println(num);
    }
}

public class MyClass extends Parent {
    int num = 100;

    MyClass(){
        super();
    }

    public void test(){
        System.out.println(num);
    }

    public static void main(String[] args) {
        MyClass obj=new MyClass();
        obj.test();
    }
}
