package Demo;

import java.util.Scanner;

public class DISCOUNTITEM {

	public static void main(String[] args) {
		
		final int PRICE = 20;
		final int RANGE1 = 10;
		final int RANGE2 = 24;
		final int RANGE3 = 50;
		
		final double DISCOUNT1 = 0;
		final double DISCOUNT2 = 0.10;
		final double DISCOUNT3 = 0.15;
		final double DISCOUNT4 = 0.20;
		
		int item=0;
		double discount=0;
		double amount=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("One item price = 20");
		System.out.print("Enter item:");
		item = sc.nextInt();
		
		if(item <= RANGE1) {
			System.out.println("Discount:" + DISCOUNT1 + "%");
			amount = item * PRICE;
			
		}
		else if(item <= RANGE2) {
			System.out.println("Discount:" + DISCOUNT2 + "%");
			amount = item * PRICE;
			discount = item * PRICE * DISCOUNT2;
			amount = amount - discount;
			
		}
		else if(item <= RANGE3) {
			System.out.println("Discount:" + DISCOUNT3 + "%");
			amount = item * PRICE;
			discount = amount * DISCOUNT3;
			amount = amount - discount;
			
		}
		else{
			System.out.println("Discount:" + DISCOUNT4 + "%");
			amount = item * PRICE;
			discount = amount * DISCOUNT4;
			amount = amount - discount;
		}
		

		System.out.println("Discount amount:" + discount);
		System.out.println("Total amount:" + amount);
	}

}
