package Nestedif;

import java.util.Scanner;

/* You are creating a program for a learning management system that checks the performance of a student in three tests.
 *  The program should accept scores of three tests. If all the scores are above 50, it should print "Passed All". 
 *  If not, and if the average score is above 50, it should print "Average Score Passed". */
public class Tests {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the score of first test.");
		int fis = scan.nextInt();
		System.out.println("Enter the score of second test.");
		int sec = scan.nextInt();
		System.out.println("Enter the score of third test");
		int thi = scan.nextInt();
	    average(fis,sec,thi);
	    scan.close();
	}
	static void average(int fis,int sec,int thi)
	{
		if(fis >=50 && sec>=50 && thi>=50)
		{
			System.out.println("Passed All");
			if(fis+sec+thi/3>=50)
			{
				System.out.println("Average score Passed.");
			}
		}
	}

}
