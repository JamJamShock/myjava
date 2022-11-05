package Demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Temperature {

	public static void main(String[] args) throws IOException {
		BufferedReader in=new BufferedReader (new InputStreamReader(System.in));
		
		System.out.print("Enter temperature:");
		int temp =Integer.parseInt(in.readLine());
		
		if (temp < 30) {
			System.out.println("a little cool");
		}
		else {
			System.out.println("a good weather");
		}
	}

}
