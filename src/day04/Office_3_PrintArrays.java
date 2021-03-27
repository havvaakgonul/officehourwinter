package day04;

import java.util.Arrays;

public class Office_3_PrintArrays {

	public static void main(String[] args) {
		
			//  ! Create a static method name: acceptString
				//  It should accept 3 strings as parameter
				//  ! and print them as an array
				//  ! e.g. String[] array = { "sam", "john", "tom" };
				//  ! acceptString(“sam”,”john”,”tom”);
				//  ! Then output: [sam,john,tom]
				
				//  ! Create another static method name: acceptString2
				//  It should take 3 strings as parameter
				//  ! and print each element in the array
				//  ! e.g. String[] array = { "sam", "john", "tom" };
				//  ! acceptString(“sam”,”john”,”tom”);
				//  ! Then output: sam john tom
				
				String name1="Sam";
				String name2="John";
				String name3="Tom";
				
				acceptString(name1,name2,name3);
				System.out.println();
				//acceptString2(name1,name2,name3);​
	}
		public static void acceptString2(String name1, String name2, String name3) {
				String[] array= {name1,name2,name3};
				System.out.println(Arrays.toString(array));	
			}
		public static void acceptString(String name1, String name2, String name3) {
				String[] names = {name1,name2,name3};
				for(int i=0;i<names.length;i++) {
					System.out.print(names[i]+" ");
				}


	}

}
