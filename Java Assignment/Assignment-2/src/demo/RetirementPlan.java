package demo;

import java.util.Scanner;

public class RetirementPlan {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);

        System.out.print("Number of working years : ");
        int numWorkingYear = get.nextInt();

        System.out.print("Save money amount per year : ");
        double saveAmount = get.nextInt();

        final double interestRate = 0.03;
        double totalAmount = 0;
        final int spend = 50000;
        int endYear = 40;
        int i = 0;
        int j = 0;

        while (i < numWorkingYear) {
            totalAmount += saveAmount;
            totalAmount += (totalAmount * interestRate);
            i++;
        }
        while (j <= endYear && totalAmount > 0) {
            System.out.println("Year : " + j + " : " + "amount : " + totalAmount);
            totalAmount -= spend;
            totalAmount += (totalAmount * interestRate);
            j++;
        }
    }
}

