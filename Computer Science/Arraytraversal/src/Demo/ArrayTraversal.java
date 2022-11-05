package Demo;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTraversal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter Amount : ");
        int capacity = sc.nextInt();
        int[] arr =new int[capacity];
        for(int i=0;i< capacity;i++){
            System.out.println("Enter Integer : ");
            arr[i]=sc.nextInt();
        }
        System.out.println("Your Array : " + Arrays.toString(arr));
        sc.close();
    }
}
