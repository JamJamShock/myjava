package demo;

import java.util.Scanner;

public class HollywoodMovieRating {
    public static void main(String[] args) {
        Scanner star = new Scanner(System.in);

        System.out.print("Enter number of stars : ");
        int stars = star.nextInt();

        int totalStars = 0;
        int loop = 0;

        if (stars < 0) {
            System.out.println("End Program");
        } else {
            do {
                if (stars < 0 || stars > 4) {
                    System.out.print("Please put stars from 0 to 4 range : ");
                    stars = star.nextInt();
                } else {
                    loop++;
                    totalStars += stars;
                    System.out.print("Enter number of stars : ");
                    stars = star.nextInt();
                }
            } while (stars > 0);
            double averageStars = totalStars / loop;
            System.out.println("");
            System.out.print("Average star rating for the movie : " + averageStars + " stars");
        }
    }
}

