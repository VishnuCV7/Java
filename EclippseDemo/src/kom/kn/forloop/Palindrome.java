package kom.kn.forloop;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number.");
		int num = scan.nextInt();
		prime(num);
		scan.close();
		
	}
	static void prime(int num)
	{
			int dig,sum = 0,temp = num;
			while(num>0)
			{
				dig = num%10;
				sum = (sum*10)+dig;
				num = num/10;
			}
			System.out.println(sum);
			if(temp == sum)
			{
				System.out.println("the given number is palindrome.");
			}
			else
			{
				System.out.println("the given number is not a palindrome.");
			}
	}

}
