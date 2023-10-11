package Work;
/*Imagine you're designing the software for a new extreme roller coaster ride in an amusement park.
 *The roller coaster has an age restriction - only individuals 12 years or older are allowed on the ride. 
 *Your program should take as input the age of a visitor. If the age is 12 or above, the program should print "Ride access granted".*/
import java.util.Scanner;

public class Discount {
	public static void main(String[]args)
	{

	Scanner scan = new Scanner(System.in);
	System.out.println("Please enter the purchase amount.");
	int age = scan.nextInt();
	dis(age);
	scan.close();
	}
	
	static void dis(int age)
	{
	if(age>=200)
	{
		System.out.println("Discount Applicable.");
	}
		
	}
}