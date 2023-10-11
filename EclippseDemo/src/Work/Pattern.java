package Work;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range");
		int range = scan.nextInt();
		pat(range);
		scan.close();
	}
	static void pat(int range)
	{
		for(int i =1;i<=range;i++)
		{
			System.out.print("*");
		}
	}

}
