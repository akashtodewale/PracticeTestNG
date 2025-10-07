package PracticeJava;

public class HumptyDumty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Write a program for an array of numbers, if the number is divisible by 3 then print "Humpty" and divisible by 5 then print "Dumpty"
		
		//int arr[] = {1,2,3,4,5,6,7,8,9,15};
		
		for(int i=1; i<=30; i++) {
			
			 if (i%5==0 && i%3==0) {
					
					System.out.println(i + " Humpty Dumpty");
				}
		    else if (i%3==0) {
				
				System.out.println(i +" Humpty");
			}
			else if (i%5==0) {
				
				System.out.println(i +" Dumpty");
			}
//			else {
//				
//				System.out.println(i + " Not in HumptyDumpty");
//			}
           
			
		}
		
		
	}

}
