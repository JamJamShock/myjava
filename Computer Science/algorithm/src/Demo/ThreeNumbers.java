package Demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThreeNumbers {

	public static void main(String[] args) throws IOException{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter num1:");
		int num1=Integer.parseInt(in.readLine());
		
		System.out.print("Enter num2:");
		int num2=Integer.parseInt(in.readLine());
		
		System.out.print("Enter num3:");
		int num3=Integer.parseInt(in.readLine());
		
		int max = 0;
		
		max = num1 > num2 ? num1 : num2;
		max = num3 >  max ? num3 : max;
		
		System.out.println("Max:" + max);
		
		int mini = 0;
		
		mini = num1 < num2 ? num1 : num2;
		mini = num3 < mini ? num3 : mini;
		
		System.out.println("Mini:" + mini);
	}
	
}
