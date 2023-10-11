package ElseifLadder;

import java.util.Scanner;

/* As part of a school assignment, you are creating a program to categorize integers. 
 * The program should take an integer as input. If the integer is less than 0, it should print "Negative". 
 * If the integer is greater than 0, it should print "Positive". If the integer is exactly 0, it should print "Zero".*/
public class Number {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number.");
		int num = scan.nextInt();
		integer(num);
		scan.close();
	}
	static void integer(int num)
	{
		if(num>0)
		{
			System.out.println("Number is Positive.");
		}
		else if(num==0)
		{
			System.out.println("Zero.");
		}
		else
		{
			System.out.println("Number is Negative.");
		}
	}

}
