package Work;

import java.util.Scanner;

public class Decimaltobinary {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number.");
		int num = scan.nextInt();
		deci(num);
		scan.close();
		}
	static void deci(int num)
	{
		int dig;
		do
		{
			dig = num%2;
			System.out.print(dig);
			num=num/2;
			
			
			
		}
		while(num>0);
		{
		}
	}

}
