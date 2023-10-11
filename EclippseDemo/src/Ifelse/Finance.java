package Ifelse;

import java.util.Scanner;

/*You're developing a software tool for a financial institution. 
 *The software should be able to validate if the input balance amount is positive or negative. 
 *Write a Java program that takes a balance amount as input. If the amount is less than 0, 
 *the program should print "Negative Balance". Otherwise, it should print "Positive Balance".*/
public class Finance {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your bank balance.");
		int balance = scan.nextInt();
		balanceamt(balance);
		scan.close();
		}
	static void balanceamt(int balance)
	{
		if(balance>0)
		{
			System.out.println("Positive Balance.");
		}
		else
		{
			System.out.println("Negative Balance.");
		}
	}

}
