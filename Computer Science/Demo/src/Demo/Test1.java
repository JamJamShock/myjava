package Demo;

import org.w3c.dom.css.Counter;

public class Test1 {
    int i;

    int countUp(){
        return ++i;
    }

    public static void main(String[] args) {
        Test1 c1 = new Test1();
        Test1 c2 = new Test1();
        System.out.println("1 C1 : " + c1.countUp());
        System.out.println("1 C2 : " + c2.countUp());
        System.out.println("2 C1 : " + c1.countUp());
        System.out.println("2 C2 : " + c2.countUp());
    }
}
