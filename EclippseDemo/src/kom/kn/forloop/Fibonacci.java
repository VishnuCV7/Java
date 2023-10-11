package kom.kn.forloop;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		printfibbonaci(num);
		scan.close();
		}
	static void printfibbonaci(int num)
	{
		int first=0,second=1,next=0;
		System.out.print(first+" "+second+" ");
		for(int i = 1;i<=num;i++)
		{
			next=first+second;
			System.out.print(next+" ");
			first = second;
			second = next;
		}
	}

}
