package demo.arbitrary;

public class Main {
    public static void main(String[] args) {
        /*
        IntPredicate obj1 = (a,b) -> a.isFactor(b);
        obj1=MyIntNum::isFactor;
        boolean test = obj1.test(new MyIntNum(16),2);
        if(test){
            System.out.println("2 is a factor of 16. ");
        }
         */

        IGreet obj2=MyIntNum::greet;
        obj2=(a,b) -> a.greet(b);
        System.out.println(obj2.greet(new MyIntNum(),"John"));
    }
}
