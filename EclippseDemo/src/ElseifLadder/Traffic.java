package ElseifLadder;

import java.util.Scanner;

/* You're developing an interactive tool for a driving school.
 *  The tool takes a traffic light color (Red, Yellow, Green) as input and suggests the action a driver should take.
 *  The program should print "Stop" for "Red", "Ready" for "Yellow", and "Go" for "Green".*/
public class Traffic {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Traffic light color.");
		String color = scan.nextLine();
		light(color);
		scan.close();
	}
	static void light(String color)
	{
		if(color.equals("red"))
		{
			System.out.println("Stop");
		}
		else if(color.equals("yellow"))
		{
			System.out.println("ready");
		}
		else if(color.equals("green"))
		{
			System.out.println("go");
		}
	}

}
