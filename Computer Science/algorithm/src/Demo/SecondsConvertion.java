package Demo;

import java.util.Scanner;

public class SecondsConvertion {

	public static void main(String[] args) {
		int DAYS_IN_SECONDS = 84600;
		int HOURS_IN_SECONDS = 3600;
		int MINUTES_IN_SECONDS = 60;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter seconds:");
		int input=sc.nextInt();
		
		int days = input / DAYS_IN_SECONDS;
		int rDays = input % DAYS_IN_SECONDS;
		int hours = rDays / HOURS_IN_SECONDS;
		int rHours = rDays % HOURS_IN_SECONDS;
		int minutes = rHours / MINUTES_IN_SECONDS;
		int seconds = rHours % MINUTES_IN_SECONDS;
		
		if(input >= DAYS_IN_SECONDS) {
			System.out.println(input + " seconds equal to: " + days
					+" days " + hours + " hours " + minutes + " minutes "
					+ seconds + " seconds "
			);
		}
		else if (input >= HOURS_IN_SECONDS) {
			System.out.println(input + " seconds equal to: " + hours
					+ " hours " + minutes +" minutes " + seconds + " seconds ");
		}
		else if (input >= MINUTES_IN_SECONDS) {
			System.out.println(input + " seconds equal to: " + minutes +
					" minutes " + seconds + " seconds ");
		}
		else {
			System.out.println(input + " seconds equal to: " + seconds + " seconds ");
		}

	}

}
