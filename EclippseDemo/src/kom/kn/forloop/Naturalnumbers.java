package kom.kn.forloop;

import java.util.Scanner;

public class Naturalnumbers {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		System.out.println("Enter the natural number.");
		int num = scan.nextInt();
		sum(num);
		scan.close();
	}
	static void sum(int num)
	{
		for(int i = 1;i<=num;i++)
		{
			i=num*(num+1)/2;
			System.out.println("sum = "+i);
		}
	}

}
