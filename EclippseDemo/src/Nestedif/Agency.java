package Nestedif;

import java.util.Scanner;

/*You're designing a program for a recruitment agency that determines whether a candidate is suitable for a job role. 
 * The program should take years of experience and the candidate's skill level as inputs. 
 * A candidate is suitable if they have more than 5 years of experience and a skill level above 7. 
 * If the candidate has the required experience, it should then check their skill level. 
 * If both conditions are met, it should print "Suitable Candidate".*/
public class Agency {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your years of experience.");
		int exp = scan.nextInt();
		System.out.println("Enter your skill level.");
		int skill = scan.nextInt();
		recur(exp,skill);
		scan.close();
		
	}
	static void recur(int exp,int skill)
	{
		if (exp>=5)
		{
			if(skill>=7)
			{
				System.out.println("Suitable Candidate.");
			}
		}
	}

}
