package Demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BMI {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int weight = 0;
        int height = 0;

        System.out.println(" Put your weight with lb : ");
        weight = Integer.parseInt(in.readLine());

        System.out.println(" Put your height with inches : ");
        height = Integer.parseInt(in.readLine());
        double bmi = weight * 703 / (height * height);
        System.out.println(bmi);

        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi > 25) {
            System.out.println("Your are overweight.");
        } else {
            System.out.println("Your are normal.");
        }
    }
}
