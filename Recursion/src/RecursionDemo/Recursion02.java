package RecursionDemo;        //Even number using recursion

import java.util.Scanner;

public class Recursion02 {
	public static void even(int num) {
		if(num==0)
		{
			return;
		}
		if(num%2==0)
		{
			even(num-2);
			System.out.print(num+" ");
		}
		else
		{
			even(num-1);
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		even(num);
		scan.close();
	}

}
