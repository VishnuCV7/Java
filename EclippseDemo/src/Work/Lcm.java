package Work;

import java.util.Scanner;

public class Lcm {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=scan.nextInt();
		System.out.println("Enter the value of b");
		int b = scan.nextInt();
		int gcd = 1;
		lcma(a,b,gcd);
		lcmaa(a,b,gcd);
		scan.close();
	}
	static void lcma(int a,int b,int gcd)
	{
		for(int i=1;i<=a && i<=b;i++)

		{
			if(a%i==0 && b%i==0)
			{
				gcd = i;
			}
		}
	}
	static void lcmaa(int a,int b,int gcd)
	{
		int lcm = 0;
		if(gcd>=0)
		{
			lcm=(a*b)/gcd;
			System.out.println(lcm);
		}
	}
	

}
