package Ifelse;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the year ");
		int year = scan.nextInt();
		leap(year);
		scan.close();
	}
		
	static void leap(int year)
	{
		if(year%4==0)
		{
			System.out.println("Leap Year");
		}
		else {
			System.out.println("not leap year");
		}
		

	}

}
