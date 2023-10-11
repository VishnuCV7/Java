
package Recursion1;

import java.util.Scanner;

public class FibbonachiUsingRecursion {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range of the seeries.");
		int num=scan.nextInt();
		
		FibbonachiUsingRecursionApp fib = new FibbonachiUsingRecursionApp();
		int res=fib.fibbonachi(num);
		
		for(int i=0;i<=0;i++)
		{
			System.out.println(res);
		}
		scan.close();
	}

}
