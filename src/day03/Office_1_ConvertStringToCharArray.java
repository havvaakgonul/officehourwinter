package day03;

import java.util.Arrays;

public class Office_1_ConvertStringToCharArray {

	public static void main(String[] args) {
		/* create a custom return type method accepts a name as parameter
	        * and prints the name as a char array
	        *
	        * (do not use toCharArray() method)
	        *
	        * Input : John
	        * Output : [J, o, h, n]
	*/
	
	String input="John";
	charArray(input);
	
	
	
	}

	private static void charArray(String input) {
		char output[]=new char[input.length()];
		
		for (int i = 0; i < input.length(); i++) {
			output[i]=input.charAt(i);
			
		}
		System.out.println(Arrays.toString(output));
	//	String a[]=input.split("");
	//	System.out.println(Arrays.toString(a));
	}
	

}
