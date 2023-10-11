package welcome;
import java.util.Scanner;
public class Sub {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a numbers");
		int a = scan.nextInt();
		if(a%2==0) {
			System.out.println("The number is Even");
		}
		else
		{
			System.out.println("The number is Odd");
		}
	
		scan.close();

	}

}
//1.