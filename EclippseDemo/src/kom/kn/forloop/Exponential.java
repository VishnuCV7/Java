package kom.kn.forloop;

import java.util.Scanner;

public class Exponential {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of Exponent");
		int a = scan.nextInt();
		System.out.println("Enter the value of base");
		int b = scan.nextInt();
		expo(a,b);
		scan.close();
	}
	static void expo(int a,int b)
	{
		int power = 1;
		for(int i=1;i<=a;i++)
		{
			power = power * b;
		}
		System.out.println("Value = "+power);
	}

}
