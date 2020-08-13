//*******************************************************
//	BigOhN3.java			Author: Ben Callen
//
//	Demonstrates the simplest program with O(N^3) time
//	complexity
//*******************************************************

import java.util.Scanner;

public class BigOhN3 {
	
	public static int sample (int x) {
		int sum = 0;
		
		for (int i = 0; i<=x; i++) {
			for (int j = 0; j<=x; j++) {
				for (int k = 0; k<=x; k++) {
					sum = i * j * k;
				}
			}
		}
		
		return sum;
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number less than 10: ");
		
		int x = input.nextInt();
		
		System.out.println("Answer is: " + sample(x));
		
		input.close();

	}

}
