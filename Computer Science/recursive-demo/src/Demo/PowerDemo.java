package Demo;

public class PowerDemo {

    public static void main(String[] args) {
        System.out.println("2 power of 3: " + power(2,7));
    }

    public static int power(int y,int n){
        if(n==0){
            return 1;
        }
        return y * power(y,n-1);
    }
}
