package Nestedif;

import java.util.Scanner;

/*You're designing an application for space enthusiasts that provides information about the solar system.
 *  The application should take a planet's name as input and outputs its order from the Sun. 
 *  Consider the order: Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus, Neptune.*/
public class Planets {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Planet name.");
		String planet = scan.nextLine();
		planetname(planet);
		scan.close();
	}
	static void planetname(String planet)
	{
		switch(planet)
		{
		case ("Mercury"):
			{System.out.println("1");
		break;}
		case ("venus"):
			{System.out.println("2");
		break;}
		case ("earth"):
			{System.out.println("3");
		break;}
		case ("mars"):
		{System.out.println("4");
		break;
		}
		case ("jupiter"):
		{
			System.out.println("5");
			break;
		}
		case ("satrun"):
		{
			System.out.println("6");
			break;
		}
		case ("uranus"):
		{
			System.out.println("7");
			break;
		}
		case ("neptune"):
		{
			System.out.println("8");
			break;
		}
		
		}
	}
}


