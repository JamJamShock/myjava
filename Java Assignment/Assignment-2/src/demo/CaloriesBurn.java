package demo;

import java.util.Scanner;

public class CaloriesBurn {
    public static void main(String[] args) {

        Scanner get = new Scanner(System.in);

        System.out.print("Input your training minutes : ");
        int minutes = get.nextInt();

        final double calories = 3.9;

        double totalCaloriesBurn = 0;

        for (int i = 0; i <= minutes; i++) {
            totalCaloriesBurn = calories * minutes;
        }
        System.out.println("Total calories burn : " + totalCaloriesBurn + " calories burn");
    }
}
