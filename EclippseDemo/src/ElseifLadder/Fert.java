package ElseifLadder;

import java.util.Scanner;

/*You're creating an application for a gardening shop that provides advice on the type of fertilizer to use 
 * based on the type of plant. The application should take a plant type as input (1 for Roses, 
 * 2 for Sunflowers, 3 for Orchids, 4 for Cacti, 5 for Ferns) and suggest the type of fertilizer to use.
 * Consider the following fertilizers: Roses - Rose Food, Sunflowers - All Purpose Fertilizer, Orchids - Orchid Fertilizer, 
 * Cacti - Cactus Mix, Ferns - Organic Compost.*/
public class Fert {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the plant type");
		int num = scan.nextInt();
		ferti(num);
		scan.close();
	}
	static void ferti(int num)
	{
		switch(num)
		{
		case 1:
		{
			System.out.println("Rose Food");
			break;
		}
		case 2:
		{
			System.out.println("All Purpose Fertilizer");
			break;
		}
		case 3:
		{
			System.out.println("Orchid Fertilizer");
			break;
		}
		case 4:
		{
			System.out.println("Cactus Mix");
			break;
		}
		case 5:
		{
			System.out.println("Organic Compost");
			break;
		}
		}
	}

}
