package Demo;

import java.util.Arrays;
import java.util.Scanner;

public class SampleOutput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int capacity = sc.nextInt();
        int [] arr = new int[capacity];
        double sum = 0;
        for(int i=0; i<capacity; i++){
            System.out.println("Enter number: ");
            arr[i]=sc.nextInt();
            sum += arr[i];
        }
        System.out.println("Your Arrays: " + Arrays.toString(arr));
        System.out.println("Total: " + sum);
        System.out.println("Mean Value: "+ sum/arr.length);
        sc.close();
    }
}
