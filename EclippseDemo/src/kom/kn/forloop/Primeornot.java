package kom.kn.forloop;

import java.util.Scanner;

public class Primeornot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to check prime or not");
		int num = scan.nextInt();
		boolean isprime =isprimenum(num);
		if(isprime==true)
		{
			System.out.println(num+" is a prime number.");
		}
		else
		{
			System.out.println(num+" is not a prime number.");
		}
		scan.close();
	}
	static boolean isprimenum(int num)
	{
		boolean isprime=true;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				isprime=false;
				
			}
			
		}
		return isprime;
	}

}
