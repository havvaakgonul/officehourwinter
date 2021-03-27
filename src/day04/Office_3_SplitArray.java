package day04;

import java.util.Scanner;

public class Office_3_SplitArray {
		public static void main(String[] args) {
		/*
		 * Ask user to enter 5 names then assign them to an array
		 * 
		 * eg: String names = "john Marry william Brian Richard";
		 * Then print the names one by one on the console
		 * 
		 * Hint: String [] arrayNames = names.split(" ");
		 */
		
		Scanner scan = new  Scanner(System.in);
		System.out.println("Please enter 5 names leaving spacebetween them");
		
		String names = scan.nextLine();
		
		String [] arrayNames = names.split(" ");
		
		for(int i=0; i<arrayNames.length;i++) {
			System.out.println(arrayNames[i]);
		
		}
		}
}
