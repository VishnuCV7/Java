import java.util.Scanner;
// Write a program to calculate the sum of a series 1 + 1/2 + 1/3 + ... + 1/n.
public class Fractionadd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range.");
		int range = scan.nextInt();
		fact(range);
		scan.close();
	}
	static void fact(int range)
	{
		double sum=0,i=1;
		while(i<=range)
		{
			sum=sum+(1/i);
			i++;
		}
		System.out.println("sum = "+sum);
	}

}
