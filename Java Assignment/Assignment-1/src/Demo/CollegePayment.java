package Demo;

public class CollegePayment {
    public static void main(String[] args) {

        int i = 1;
        double cost = 6000;

        while (i <= 5) {
            double r = cost * 0.02;
            double totalAmount = cost + r;
            cost=totalAmount;
            System.out.println((i) + " year payment : " + totalAmount);
            i++;
        }

        //System.out.println(totalAmount);
    }
}
