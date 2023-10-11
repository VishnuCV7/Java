package Strings2;

import java.util.Scanner;

public class FindUniquecharApp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=scan.next();
		char[] arr=s1.toCharArray();
	
		FindUniquechar f1 =new FindUniquechar();
		f1.unique(arr);
		scan.close();
	}
}