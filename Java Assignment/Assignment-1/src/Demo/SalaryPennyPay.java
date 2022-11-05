package Demo;

import java.util.Scanner;

public class SalaryPennyPay {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Days : ");
        int day=sc.nextInt();

        int penny=1;
        double total=0;

        for(int i=1; i<=day; i++){
            System.out.println(i+" day : "+penny+" penny ");
            total+=penny;
            penny=penny*2;
        }
        System.out.println();
        System.out.println("Total dollar pay : " + total/100 + " dollar");
    }
}
