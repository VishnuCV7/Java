package Strings3;

import java.util.Scanner;

public class LongestSubString {

	public static void main(String[] args) {

		//taking input
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string");
		String s1=scan.nextLine();
		
		//Splitting the string into substrings and storing them in a string array
		
		
		LongestSubStringApp substring =new LongestSubStringApp();
		substring.longest(s1);
		
		System.out.println(substring.longest(s1));
		scan.close();
	}

}
