package PracticeJava;
import java.util.*;
import java.io.*;

public class StringChallenge {

    public static String StringChallenge(int num) {
        int hours = num / 60;
        int min = num % 60;
        return hours + ":" + min;  // return as string "h:m"
    }

    public static void main(String[] args) {
    	System.out.println("Please enter a number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(StringChallenge(num));
    }
}