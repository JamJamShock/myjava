package Demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GRADE {

	public static void main(String[] args) throws IOException {
		
		int score=0;
		
		BufferedReader in=new BufferedReader (new InputStreamReader(System.in));
		
		System.out.println("Enter Score:");
		score=Integer.parseInt(in.readLine());
		
		if(score<60) {
			System.out.println("Your grade F");
		}
		else if(score<70) {
			System.out.println("Your grade D");
		}
		else if(score<80) {
			System.out.println("Your grade C");
		}
		else if(score<90) {
			System.out.println("Your grade B");
		}
		else {
			System.out.println("Your grade A");
		}
		
		
	}

}
