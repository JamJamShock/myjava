package demo.myinstance;

public class Main {
    public static void main(String[] args) {
        MyIntNum obj1=new MyIntNum(16);
        MyIntNum obj2=new MyIntNum(12);
        //MyIntNum obj3=new MyIntNum(0);

        IntPredicate ip= a -> obj1.isFactor(a);
        ip = obj1::isFactor;
        boolean test=ip.test(3);
        if(test){
            System.out.println(" 3 is a factor of 12. ");
        }

        ip = obj2::isFactor;
        test = ip.test(5);
        if(!test){
            System.out.println(" 5 is not a factor of 16");
        }

        /*
        Add ad= (x,y) -> obj3.add(x,y);
        ad = obj3::add;
        int add=ad.add(24,56);
        System.out.println(" " + add);
        */
    }
}
