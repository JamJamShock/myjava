package Demo;

public class Test2 {
    static int i;

    int countUp() {
        return ++i;
    }

    void count(){
        int cou = 10;
        cou += 20;
        System.out.println(cou);
    }
    void something (){

    }

    public static void main(String[] args) {
        Test2 obj = new Test2();
        Test2 obj2 = new Test2();
        System.out.println("1 Counter : " + obj.countUp());
        System.out.println("1 Counter : " + obj2.countUp());
        System.out.println("2 Counter : " + obj.countUp());
        System.out.println("2 Counter : " + obj2.countUp());
    }
}
