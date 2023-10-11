package Strings3;

import java.util.Scanner;

public class TitleCase {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		String s1= scan.nextLine();
		
		TitleCaseApp fup = new TitleCaseApp();
		fup.firstUpper(s1);
		
		System.out.println(fup.firstUpper(s1));
		
		scan.close();
	}

}
