package PracticeJava;

import java.util.Scanner;

public class Reverse_number {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter number:");
		int num = scan.nextInt();
		
		int rev=0;
		
		while(num!=0) {
			int rem = num%10;
			rev = rev*10+rem;
		    num = num/10;
			
		}
		System.out.println("Reverse number is: " + rev);
		
		
	}
}

