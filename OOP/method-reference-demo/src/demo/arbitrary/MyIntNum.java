package demo.arbitrary;

public class MyIntNum {
    private int num;

    public MyIntNum(){

    }

    public MyIntNum(int num) {
        this.num = num;
    }

    public boolean isFactor(int n){
        return num % n == 0;
    }

    public String greet(String name){
        return "Hello!" + name;
    }
}
