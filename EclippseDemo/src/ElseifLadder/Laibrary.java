package ElseifLadder;

import java.util.Scanner;

/*You're designing a program for a library which provides information about different book genres. 
 * The program should take a genre number as input and print the corresponding genre. 
 * Consider the following genres: 1 - Fiction, 2 - Non-Fiction, 3 - Fantasy, 4 - Mystery, 5 - Biography.*/
public class Laibrary {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the gener Number.");
		int num = scan.nextInt();
		info(num);
		scan.close();
     }
	static void info(int num)
	{
		switch(num)
		{
		case 1:
		{
			System.out.println("Fiction");
			break;
		}
		case 2:
		{
			System.out.println("Non-Fiction");
			break;
		}
		case 3:
		{
			System.out.println("Fantasy");
			break;
		}
		case 4:
		{
			System.out.println("Mystery");
			break;
		}
		case 5:
		{
			System.out.println("Biography");
			break;
		}
		}
	}

}
