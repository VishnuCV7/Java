package Stringcomparison;

import java.util.Scanner;

public class ReverseaString {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string to be reversed");
		String orgstr = scan.nextLine();
		String revstr = "";
		
		for(int i = 0;i < orgstr.length();i++)
		{
			revstr = orgstr.charAt(i)+revstr;
		}
		
		System.out.print(revstr);
		scan.close();
	}

}
