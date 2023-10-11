package welcome;

import java.util.Scanner;

public class GradingSystem {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your cgpa.");
		double cgpa = scan.nextDouble();
		if(cgpa>=90)
		{
			System.out.println("A Grade.");
		}
		else if(cgpa>=75&&cgpa<90)
		{
			System.out.println("B Grade.");
		}
		else if(cgpa>=65&&cgpa<75)
		{
			System.out.println("C Grade.");
		}
		else if(cgpa>=45&&cgpa<65)
		{
			System.out.println("D Grade.");
		}
		else if(cgpa>=35&&cgpa<45)
		{
			System.out.println("E Grade.");
		}
		else
		{
			System.out.println("Try Again");
		}
scan.close();
		
		

	}

}
