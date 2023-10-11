package Work;
/*As a software developer, you're tasked with creating a simple validation system for a data entry application. 
 *The application is meant to process only positive integers. In order to guide user input,
 *the system should print a guiding message "Positive number - processing..." if the entered number is greater than zero.*/
import java.util.Scanner;

public class PositiveNumber {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		number(num);
		scan.close();
	}

	private static void number(int num) {
		if(num > 0 )
		{
			System.out.println("Positive number.");
		}		
	}

}
