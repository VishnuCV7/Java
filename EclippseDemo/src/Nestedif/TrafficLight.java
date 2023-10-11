package Nestedif;

import java.util.Scanner;

/*As a part of a traffic management system, 
 * you are creating a program that determines a person's eligibility for a driving license based on their age and 
 * eyesight score (out of 10). The program should take age and eyesight score as inputs. 
 * A person is eligible for a driving license if they are at least 18 years old and their eyesight score is 6 or above. 
 * If both conditions are met, the program should print "Driving License Eligible". */
public class TrafficLight {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age.");
		int age = scan.nextInt();
		System.out.println("enter your Eyesight score.");
		int eye = scan.nextInt();
		traffic(age,eye);
		scan.close();
		
	}
	static void traffic(int age,int eye)
	{
		if(age >= 18)
		{
			if(eye>=6)
			{
				System.out.println("Driving Licence Eligible");
			}
		}
	}

}
