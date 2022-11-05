package demo;

import java.util.Scanner;

public class VehicleTravels {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.print("Speed of the vehicle in 'MPH' : ");
        double speed = enter.nextDouble();
        System.out.print("How many hours has it travel ? : ");
        int hours = enter.nextInt();
        double Distance = 0;

        for (int i = 1; i <= hours; i++) {
            Distance = i * speed;
            System.out.print("Time : " + i + " hours");
            System.out.println(" ; Distance : " + Distance + " miles");
        }

    }
}
