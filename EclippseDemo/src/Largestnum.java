import java.util.Scanner;

public class Largestnum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number.");
		int num = scan.nextInt();
		larg(num);
		scan.close();
	}
	static void larg(int num)
	{
		int i = 0,digit=1,temp = 0;
		while(i<num)
		{
			digit = num % 10;
			if(digit>temp)
			{
				temp=digit;
			}
			num = num/10;
		}
		System.out.println(digit);
		
	}

}
