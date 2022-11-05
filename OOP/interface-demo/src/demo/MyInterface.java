package demo;

public sealed abstract interface MyInterface permits Calculator{
    int NUM=3;
    double calculate(int num1,int num2);

    public default String doSomething(){
        return "MyInterface do something";
    }
    public static String greet(String name){
        return "Hello !" + name;
    }
}
