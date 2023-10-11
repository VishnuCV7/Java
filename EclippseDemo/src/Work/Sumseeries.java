package Work;

import java.util.Scanner;

public class Sumseeries {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the range.");
		int ra = scan.nextInt();
		sum(ra);
		scan.close();
	}
	static void sum(int ra)
	{
		int i=1,su = 0;
		while(ra>=i)
			{
				su +=Math.pow(i, 2);
				i++;
			}
		System.out.println(su);
	}

}
