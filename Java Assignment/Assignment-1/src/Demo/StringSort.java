package Demo;

import java.util.Arrays;
import java.util.Scanner;

public class StringSort {
    public static void main(String[] args) {
        String [] names = new String[6];

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i<6;i++){
            System.out.println("Enter Name : ");
            String name=sc.nextLine();
            names[i]=name;
        }

        System.out.println(Arrays.toString(names));
        System.out.println();

        String mini=names[0];
        for (int i=1; i<names.length;i++){
            if(names[i].compareTo(mini)<0){
                mini=names[i];
            }
        }
        System.out.println("Smallest Name : " + mini);
        System.out.println();

        String max=names[0];
        for (int i=1; i<names.length;i++){
            if(names[i].compareTo(max)>0){
                max=names[i];
            }
        }
        System.out.println("Largest Name : " + max);
    }
}
