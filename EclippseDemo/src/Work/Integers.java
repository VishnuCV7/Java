package Work;

import java.util.Scanner;

public class Integers {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num =scan.nextInt();
		if(num>0)
		{
			if(num<10)
			{
				System.out.println("Positive single-digit number");
			}
			else
			{
				System.out.println("Positive double-digit number");
			}
		}
		else
		{
			if(num<-9)
			{
				System.out.println("Negative double-digit number");
			}
			else
			{
				System.out.println("Negative single-digit number");
			}
		}
		scan.close();
	}

}
