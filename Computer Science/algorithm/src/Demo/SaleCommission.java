package Demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SaleCommission {

    public static void main(String[] args) throws IOException {
        double sales = 0.0;
        double commission = 0.0;
        String keepGoing = "";
        final double COMMISSION_RATE = 0.10;

        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));

        do {
            System.out.println("Enter sales : ");
            sales=Double.parseDouble(in.readLine());
            commission=sales * COMMISSION_RATE;
            System.out.println("Commission : " + commission);
            System.out.println("Continue? Enter 'y' or 'Y' :" );
            keepGoing=in.readLine();


        }while(keepGoing.equalsIgnoreCase("y"));

    }

}
