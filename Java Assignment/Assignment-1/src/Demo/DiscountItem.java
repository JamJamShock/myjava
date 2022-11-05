package Demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DiscountItem {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        final int price = 99;
        final int r1 = 10;
        final int r2 = 19;
        final int r3 = 49;
        final int r4 = 99;

        final double d1 = 0.2;
        final double d2 = 0.3;
        final double d3 = 0.4;
        final double d4 = 0.5;

        int item = 0;
        System.out.println("One item price : 99");
        System.out.println("Enter item : ");

        double discount = 0;
        double amount = 0;

        item=Integer.parseInt(in.readLine());

        if(item>r1 && item<=r2){
            amount=item*price;
            discount=price*item*d1;
            amount=amount-discount;
            System.out.println("Discount : " + discount);
            System.out.println("Amount : " + amount );
        } else if (item>r2 && item<=r3) {
            amount=item*price;
            discount=price*item*d2;
            amount=amount-discount;
            System.out.println("Discount : " + discount);
            System.out.println("Amount : " + amount );
        } else if (item>r3 && item<=r4) {
            amount=item*price;
            discount=price*item*d3;
            amount=amount-discount;
            System.out.println("Discount : " + discount);
            System.out.println("Amount : " + amount );
        } else if (item>r4) {
            amount=item*price;
            discount=price*item*d4;
            amount=amount-discount;
            System.out.println("Discount : " + discount);
            System.out.println("Amount : " + amount );
        } else {
            amount=item*price;
            System.out.println("Discount : " + discount);
            System.out.println("Amount : " + amount );
        }
    }
}
