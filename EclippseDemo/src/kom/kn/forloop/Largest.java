package kom.kn.forloop;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the digit.");
		int num = scan.nextInt();
		larg(num);
		scan.close();
	}
	static void larg(int num)
	{
		int i = 0,dig,temp = 0;
		while(i<num)
		{
			dig = num%10;
			if(dig>temp)
			{
				temp=dig;
			}
			num=num/10;
		}
		System.out.println(temp);
	}

}
