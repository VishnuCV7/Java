package Ifelse;

import java.util.Scanner;

/*Imagine you're creating a simple number categorization program. 
 *The program should take a number as input. If the number is a multiple of 5,the program should print "Multiple of 5".
 *In all other cases, it should print "Not a multiple of 5".*/
public class Multiple {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number. ");
		int num = scan.nextInt();
		leap(num);
		scan.close();
	}
		
	static void leap(int num)
	{
		if(num%5==0)
		{
			System.out.println("Multiple of 5.");
		}
		else {
			System.out.println("not a multiple of 5.");
		}
		

	}

	}


