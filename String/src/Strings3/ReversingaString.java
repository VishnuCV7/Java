package Strings3;

import java.util.Scanner;

public class ReversingaString {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); 
		System.out.println("Enter the string");
		String s1= scan.nextLine();
		
		
		ReversingaStringApp rev = new ReversingaStringApp();
		rev.reverse(s1);
		
		System.out.println(rev.reverse(s1));
		scan.close();
		
	}

}
