package Demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeepGoingWhile {

	public static void main(String[] args) throws IOException {
		
		String keepGoing="y";
		double COMMISION_RATE = 0.10;
		double sales = 0;
		double commision = 0;
		
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		
		while(keepGoing.equals("y")) {
			System.out.println("Enter sales count: ");
			
			sales = Double.parseDouble(in.readLine());
			commision = sales * COMMISION_RATE;
			
			System.out.println(commision);
			
			System.out.println("Continue? Writ y :");
			keepGoing=in.readLine();
		}
	}

}
