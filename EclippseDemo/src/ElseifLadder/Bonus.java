package ElseifLadder;

import java.util.Scanner;

/*You're designing a program for an employee benefits scheme.
 *  The program should check whether an employee is eligible for a bonus based on their years of service and monthly targets met. 
 *  The program should take years of service and monthly targets met as inputs. 
 *  An employee is eligible for a bonus if they have more than 3 years of service and have met more than 6 monthly targets. 
 *  If eligible, it should print "Bonus Eligible".*/
public class Bonus {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the years of service");
		int num = scan.nextInt();
		System.out.println("Enter the monthly target");
		int target = scan.nextInt();
		employee(num,target);
		scan.close();
	}
	static void employee(int num, int target)
	{
		if(num>=3)
		{
			if(target>=6)
			{
				System.out.println("Bonus Eligible.");
			}
		}
		else
		{
			System.out.println("Not eligible.");
		}
	}

}
