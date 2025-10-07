package PracticeJava;
import java.util.Scanner;

public class primeNumber {

	// Prime number is a number that is greater than 1 and divided by 1 or itself
	// only.
	// Input = 31, Output = The number is prime.
	public static void main(String[] args) {
		System.out.println("Enter your number: ");
		
		Scanner scan = new Scanner(System.in);
				
	    int num = scan.nextInt();
        int count = 0;
	    if(num<=1) {
	    	
	    	System.out.println("the number is not prime");
	    }
	    else {
	    	 for (int i=1; i<=num; i++) {
	    		 
	    		 if(num%i==0) {
	    			 count++; 
	    		 }
	    		 
	    	 }
	    	if (count==2) {
	    		
	    		System.out.println("the number is prime");
	    	}
	    	
	    	else {
	    		System.out.println("the number is not prime");
	    	}
	    }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}