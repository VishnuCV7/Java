package Ifelse;

import java.util.Scanner;

/*You're designing a game that involves guessing the name of a polygon based on the number of sides. 
 * The program should take an integer representing the number of sides of a polygon (3 for triangle, 
 * 4 for quadrilateral, 5 for pentagon, 6 for hexagon, 7 for heptagon, 8 for octagon) and print the polygon name.*/
public class Polygon {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of sides.");
		int side = scan.nextInt();
		poly(side);
		scan.close();
	}
	static void poly(int side)
	{
		if(side == 3)
		{
			System.out.println("Triangle");
		}
		else if(side == 4)
		{
			System.out.println("QuadrilateraL");
		}
		else if(side == 5)
		{
			System.out.println("Pentagon");
		}
		else if(side == 6)
		{
			System.out.println("Hexagon");
		}
		else if(side == 7)
		{
			System.out.println("Heptagon");
		}
		else if(side == 8)
		{
			System.out.println("Octagon");
		}
	}

}
