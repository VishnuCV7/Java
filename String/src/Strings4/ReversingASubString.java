package Strings4;

import java.util.Scanner;

public class ReversingASubString {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		String input = scan.next();
		
		ReversingASubStringApp inputstr = new ReversingASubStringApp();
		inputstr.reverseofaString(input);
		
		System.out.println(inputstr.reverseofaString(input));
		scan.close();
	}

}
