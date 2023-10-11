package Nestedif;

import java.util.Scanner;

/*You are creating a program for a loan approval system. 
 * The eligibility for a loan is based on both age and income. 
 * A person is eligible if they are at least 18 years old and their annual income is over $40,000. 
 * Write a Java program that accepts age and income as input. If both conditions are met, 
 * the program should print "Loan Approved". */
public class LoanApprove {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age.");
		int age = scan.nextInt();
		System.out.println("Enter your income.");
		int income = scan.nextInt();
		loan(age,income);
		scan.close();

      }
	static void loan(int age, int income)
	{
		if(age>=18 && income>=40000)
		{
			System.out.println("Loan Approve.");
		}
		else
		{
			System.out.println("Loan not approved.");
		}
	}

}
