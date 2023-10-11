package Work;

import java.util.Scanner;

/*Your task is to create a program for a voting registration system.
 *  According to the law, a person is eligible to vote if their age is 18 or above. 
 *  Your Java program should accept a person's age as input. If the age is 18 or above, 
 *  the program should print "Voter registration eligible".*/
public class Vote {

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter your age =");
			int age = scan.nextInt();
			eligable(age);
			scan.close();
	}
			
			
			static void eligable(int age)
			{
			if(age>=18) {
				System.out.println("Eligible to vote");
			}
			

	}

}