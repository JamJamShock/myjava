package Demo;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {

        int s = 0;
        int t = 0;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Students : ");
        int stuNum=sc.nextInt();

        System.out.println("Enter Test : ");
        int testNum=sc.nextInt();

        for (s=0;s<stuNum;s++){
            double total = 0;
            double scores = 0;
            for (t=0;t<testNum;t++){
                System.out.println("Enter scores : ");
                scores=sc.nextDouble();
                total+=scores;
            }
            System.out.println("Student: " + (s+1) + " Average: " + (total/testNum));
        }
    }

}
