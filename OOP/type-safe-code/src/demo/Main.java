package demo;

public class Main {

    public static void main(String[] args) {
        MyClass<String,Integer,Integer> obj=new MyClass<>("Harry",23,54);
        System.out.println(obj.getT());
        System.out.println(obj.getR());

        MyClass<Double,Double,Integer> obj1=new MyClass<>(33.2,34.2,4);
        MyClass<Integer,Integer,Double> obj2=new MyClass<>(34,64,3.3);

        MyParentClass<String,Integer> obj4=new MyParentClass<>("Marry",34);
    }
}
