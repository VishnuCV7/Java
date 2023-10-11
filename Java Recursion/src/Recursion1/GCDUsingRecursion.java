package Recursion1;

import java.util.Scanner;

public class GCDUsingRecursion {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number.");
		int n1 = scan.nextInt();
		
		System.out.println("Enter the second number");
		int n2 = scan.nextInt();
		
		GCDUsingRecursionApp gcdoftwo = new GCDUsingRecursionApp();
		int res = gcdoftwo.gcd(n1, n2);
		
		System.out.println("The gcd of "+n1+" and "+n2+" is = "+res);
		scan.close();
		
	}

}
