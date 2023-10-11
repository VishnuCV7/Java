package Work;

import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number.");
		int num = scan.nextInt();
		sumof(num);
		scan.close();
	}
	static void sumof(int num)
	{
		int sum=0,dig;
		int a,b = 0;
		while(num>0)
		{
		dig=num%10;
		sum = sum+dig;
		num=num/10;
		while(sum>10)
		{
			a=sum%10;
			b=b+a;
			sum=sum/10;
		}
		}
		System.out.println(b);
	}
	
	

}
