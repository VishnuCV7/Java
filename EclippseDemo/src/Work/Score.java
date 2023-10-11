package Work;
import java.util.Scanner;

public class Score {
/* As an IT specialist at a university, you have been tasked to create a program that helps in marking student's grades. 
 * The program should take a student's score as an input. If the score is 60 or above, the program should print "Passed". 
 * In all other cases, it should print "Failed".*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your score.");
		int marks = scan.nextInt();
		scorem(marks);
		scan.close();
	}
static void scorem(int marks)
{
	if(marks > 60)
	{
		System.out.println("Passed.");
	}
	else
	{
		System.out.println("Failed.");
	}
}
}
