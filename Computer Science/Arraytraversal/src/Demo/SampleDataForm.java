package Demo;

import java.util.Arrays;
import java.util.Scanner;

public class SampleDataForm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Row Amount : ");
        int num = sc.nextInt();

        String [] name = new String[num];
        int [] whour = new int [num];
        int [] wrate = new int [num];
        int [] salary = new int [num];
        double [] tax = new double [num];
        double [] netpay = new double[num];

        int totalWhour= 0;
        int totalWrate=0;
        int totalSalary=0;
        double totalTax=0;
        double totalNetpay=0;

        for(int i=0;i<num;i++){
            System.out.print("Enter Name: ");
            name[i]=sc.next();
            System.out.print("Enter WHour: ");
            whour[i]=sc.nextInt();
            System.out.print("Enter WRate; ");
            wrate[i]=sc.nextInt();
            totalWhour+=whour[i];
            totalWrate+=wrate[i];
        }

        for(int j=0;j<num;j++){
            salary[j]=whour[j] * wrate[j];
            tax[j]=salary[j]*0.02;
            netpay[j]=salary[j]-tax[j];
            totalTax+=tax[j];
            totalSalary+=salary[j];
        }

        System.out.println("Name : " + Arrays.toString(name));
        System.out.println("Work Hour : " + Arrays.toString(whour));
        System.out.println("Work Rate : " + Arrays.toString(wrate));
        System.out.println("Tax : " + Arrays.toString(tax));
        System.out.println("Net Pay : " + Arrays.toString(netpay));
        System.out.println("Total Work Hour : " + totalWhour);
        System.out.println("Total Work Rate : " + totalWrate);
        System.out.println("Total Salary : " + totalSalary);

    }
}
