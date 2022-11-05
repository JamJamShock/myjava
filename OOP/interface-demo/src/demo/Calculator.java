package demo;

public non-sealed class Calculator implements MyInterface{
    public double calculate(int x,int y){
        MyInterface.greet("John");
        int sealed=5;
        System.out.println(doSomething());
        return x + y +MyInterface.NUM;
    }
}
