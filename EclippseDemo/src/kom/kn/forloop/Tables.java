package kom.kn.forloop;

import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number.");
		int num = scan.nextInt();
		multiply(num);
		scan.close();
	}
	static void multiply(int num)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+" * "+i+" = "+(num*i));
		}
		
	}

}
