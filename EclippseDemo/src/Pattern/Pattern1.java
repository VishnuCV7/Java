package Pattern;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows.");
		int a = scan.nextInt();
		System.out.println("Enter the number of column.");
		int b = scan.nextInt();
		pat(a,b);
		scan.close();
	}
	static void pat(int a,int b)
	{
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=b;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
/*output-Enter the number of rows.
3
Enter the number of column.
5
*****
*****
*****
*/