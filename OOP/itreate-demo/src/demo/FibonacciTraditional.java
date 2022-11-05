package demo;

import java.util.Scanner;

public class FibonacciTraditional {
    public static void main(String[] args) {
        int firstNum=0;
        int secondNum=1;
        int result=0;
        int userNum=0;
        int count=0;

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter numbers in Fibonacci : ");
        userNum=sc.nextInt();

        int j=0;
        while (j<userNum){
            result = firstNum + secondNum;
            count++;

            firstNum=secondNum;
            secondNum=result;
            System.out.println("\nFibonacci No.["+ count +"] : " + result);
            j++;
        }
        sc.close();
    }
}
