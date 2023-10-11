package welcome;
import java.util.Scanner;
public class Positive {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number.");
		int a = scan.nextInt();
		if(a>0)
		{
			System.out.println("The number is positive.");
		}
		else
		{
			System.out.println("The number is negative.");
		}
		scan.close();

	}

}
//2.