package Demo;

import java.util.Scanner;

public class GreatestCommonMath {

	public static void main(String[] args) {
		
		long i = 1;
		long factorial = 1;

		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number:");
		long input=sc.nextInt();

			while ( i<=input ) {
				factorial = i * factorial;
				i++;
			}
			
			System.out.println(factorial);
	}

}
