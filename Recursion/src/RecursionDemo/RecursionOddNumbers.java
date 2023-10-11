package RecursionDemo;

import java.util.Scanner;

public class RecursionOddNumbers {

	public static void odd(int n) {
		if(n==1)
		{
			return;
		}
		if(n%2==0)
		{
			odd(n-1);
		}
		else
		{
			odd(n-2);
			System.out.print(n+" ");
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the range");
		int n=s.nextInt();
		odd(n);
		s.close();
		
	}

}
