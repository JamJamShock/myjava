package demo;

import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        int totalNumber = 0;
        System.out.print("Enter a number : ");
        int num = get.nextInt();

        while (num >= 0) {
            totalNumber += num;
            System.out.print("Enter a number : ");
            num = get.nextInt();
        }

        System.out.println("Total number : " + totalNumber);
    }
}
