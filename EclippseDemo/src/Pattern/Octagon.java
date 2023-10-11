package Pattern;

import java.util.Scanner;

public class Octagon {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns.");
		int a = scan.nextInt();
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<a;j++)
			{
				if((i+j>=2 && j-i<=3) || (i-j>=3 && i+j<=8))
				{
					System.out.print("* ");
				}
			}
			System.out.println(" ");
		}
		scan.close();
	}

}
