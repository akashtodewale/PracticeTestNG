package PracticeJava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommanElements_in_Array {
	
 public static void main(String[] args) {
		
	int[] Akash = {1,3,4,8,8,2,2,3,2,4,3,4} ;
	int[] Shradha = {1,2,4,9,8,2,2,3,4,3,2,3};
	Set<Integer> common = new HashSet<Integer>();
	{
	
	
	for (int i=0;i<Akash.length;i++) {
		
		for (int j=0;j<Shradha.length;j++)
		{
			
			if(Akash[i] == Shradha[j]) {
				
				common.add(Akash[i]);
			}
		}
		
	}
	System.out.println("Common Elements are : " + common);
	}
	
	}
}
