package Ifelse;

import java.util.Scanner;

/*You are creating a program for a luxury hotel. 
 *The hotel provides senior citizens a special discount on room bookings.
 *The program should take age as input. If the age is 60 or above, the program should print "Senior Citizen Discount Applicable". 
 *Otherwise, it should print "Regular Charges Applicable".*/
public class Hotel {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age.");
		int age = scan.nextInt();
		discount(age);
		scan.close();
	}
	static void discount(int age)
	{
		if(age >= 60)
		{
			System.out.println("Senior Citizen Discount Applicable.");
		}
		else
		{
			System.out.println("Regular Charges Applicable.");
		}
	}

}
