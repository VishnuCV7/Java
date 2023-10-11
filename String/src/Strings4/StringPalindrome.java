package Strings4;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		String inputstring = scan.next();
		
		StringPalindromeApp ple=new StringPalindromeApp();
		ple.palind(inputstring);
		scan.close();
		
	}

}
