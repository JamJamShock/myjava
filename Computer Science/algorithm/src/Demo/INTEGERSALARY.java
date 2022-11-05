package Demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class INTEGERSALARY {

	public static void main(String[] args) throws IOException {
		
		int salary=0;
		int yearOnWork=0;
		
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter your salary:");
		salary=Integer.parseInt(in.readLine());
		
		System.out.println("Enter years on work:");
		yearOnWork=Integer.parseInt(in.readLine());
		
		if(salary>=35000) {
			if (yearOnWork>=2) {
				System.out.println("You got loan");
			}
			else {
				System.out.println(yearOnWork + "year is not qualifield!");
			}
		}
		else {
			System.out.println("You can't get loan");
		}

	}

}
