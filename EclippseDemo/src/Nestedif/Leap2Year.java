package Nestedif;

import java.util.Scanner;

/*You're working on a calendar application that provides users with interesting facts about years. 
 * The program should first check if the input year is a leap year. If it is, 
 * the program should further check if it belongs to the 21st century. If both conditions are true, 
 * it should print "21st Century Leap Year". If only the first condition is true, it should print "Leap Year". */
public class Leap2Year {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the year.");
		int year = scan.nextInt();
		leapyear(year);
		scan.close();
		}
	static void leapyear(int year)
	{
		if(year%4==0)
		{
			if(year>=2000&&year<=2100 && year%4==0)
			{
				System.out.println("21st century leap year.");
			}
			else
			{
				System.out.println("leap year.");
			}
		}
		else
		{
			System.out.println("Not a leap year.");
		}
	}

}
