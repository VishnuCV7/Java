package Recursion1;

import java.util.Scanner;

public class FactorialUsingRecursion {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range of the factorial ");
		int input=scan.nextInt();
		
		FactorialUsingRecursionApp fact = new FactorialUsingRecursionApp();
		int res =fact.factorial(input);
		
		
		System.out.println("The factorial of "+input+" = "+res);
		scan.close();
		
	}

}
