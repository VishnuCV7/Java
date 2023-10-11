package welcome;
import java.util.Scanner;
public class VoteDemo {


		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter your age =");
			int marks = scan.nextInt();
			if(marks>=18) {
				System.out.println("Eligible to vote");
			}
			else
			{
				System.out.println("Not Eligible to vote");
			}
			scan.close();

		}

	}

