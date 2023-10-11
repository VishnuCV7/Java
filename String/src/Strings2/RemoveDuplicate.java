package Strings2;
/*  Programe to remove duplicates in a string using array method   */

import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) {
		//taking array as input
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string");
		String s1=scan.nextLine();
		
		//converting the taken string into array.
		char[] crr =s1.toCharArray();
		
		//creating a string builder to concatenate the characters
		StringBuilder sb1 = new StringBuilder();
		
		
		RemoveDuplicateApp duplicate = new RemoveDuplicateApp();
		duplicate.removeDuplicates(crr, sb1);
		
		scan.close();
	}

}
