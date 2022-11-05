package demo;

public class Main {
    private MyInterface test;

    public String dosomething(){
        return test.dosomething();
    }

    public void setTest(MyInterface test) {
        this.test = test;
    }

    public static void main(String[] args) {
        test(new B());
    }
    public static void test(MyInterface obj){
        obj.dosomething();
    }
}
