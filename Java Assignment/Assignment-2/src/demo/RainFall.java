package demo;

import java.util.Scanner;

public class RainFall {
    public static void main(String[] args) {
        Scanner rain = new Scanner(System.in);
        System.out.print("Enter numbers of year : ");
        int years = rain.nextInt();
        int months = 12;
        double totalInches = 0;
        double inchesOfRainFall = 0;
        if (years < 1) {
            System.out.print("Please put years");
        } else {
            for (int i = 0; i < years; i++) {
                for (int j = 0; j < months; j++) {
                    System.out.print("Inches of rainfall for months : ");
                    inchesOfRainFall = rain.nextDouble();
                    totalInches += inchesOfRainFall;
                }
            }
        }
        int totalMonths = years * months;
        double averageRainfall = totalInches / totalMonths;

        System.out.println("");
        System.out.println("Number of months : " + totalMonths + " months");
        System.out.println("Total inches : " + totalInches + " inches");
        System.out.println("Average rainfall : " + averageRainfall + " inches");
    }
}
