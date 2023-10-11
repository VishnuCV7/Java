import java.util.Scanner;

public class Countofdigits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number.");
		int num = scan.nextInt();
		countof(num);
		scan.close();
	}
	static void countof(int num)
	{
		int i =0,digit,count=0;
		while(i<num)
		{
			digit = num%10;
			if(i>=0)
			{
				count++;
			}
			num=num/10;
		}
		System.out.println(count);
	}

}
