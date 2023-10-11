package kom.kn.forloop;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number.");
		int num = scan.nextInt();
		int factorial=isfactor(num);
		System.out.println("factorial = "+ factorial);
		scan.close();
	}
	static int isfactor(int num)
	{
		int fact = 1;
		for(int i=1;i<=num;i++)
		{
			fact = fact*i;
		}
		
		return fact; 
		
	}

}
