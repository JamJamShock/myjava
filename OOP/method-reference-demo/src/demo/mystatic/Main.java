package demo.mystatic;

import java.util.List;

public class Main {
    public static boolean numTest(IntPredicate p,int v){
        return p.test(v);
    }
    public static void main(String[] args) {
        boolean result;

        int num=7;
        result=numTest(a -> StaticMethodReference.isPrime(a),num);
        result=numTest(StaticMethodReference::isPrime,num);
        if(result){
            System.out.println( num + " is prime. ");
        }
        int num1=20;
        result=numTest(b -> StaticMethodReference.isEven(b),20);
        result=numTest(StaticMethodReference::isEven,num1);
        if(result){
            System.out.println(num1 + " is Evan. ");
        }

        result=numTest(c-> StaticMethodReference.isPositive(c),num);
        result=numTest(StaticMethodReference::isPositive,num);
        if(result){
            System.out.println(num + " is positive. ");
        }

        MyInterface obj=a -> StaticMethodReference.greet(a);

        MyInterface obj2=StaticMethodReference::greet;

        MyNameInterface obj3= e -> StaticMethodReference.showName(e);
        MyNameInterface obj4= StaticMethodReference::showName;
        obj4.show("Win Thu Rein Tun");
    }
}
