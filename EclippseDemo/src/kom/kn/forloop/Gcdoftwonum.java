package kom.kn.forloop;

import java.util.Scanner;

public class Gcdoftwonum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers.");
		int a = scan.nextInt();
		int b = scan.nextInt();
		gcdof(a,b);
		scan.close();
	}
	static void gcdof(int a, int b)
	{
		int gcd = 1;
		for(int i=1;i<=a && i<=b;i++)

		{
			if(a%i==0 && b%i==0)
			{
				gcd = i;
			}
		}
		System.out.println("gcd = "+gcd);
	}

}
