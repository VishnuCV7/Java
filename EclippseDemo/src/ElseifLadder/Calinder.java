package ElseifLadder;

import java.util.Scanner;

/*As part of a calendar application, you are creating a feature that displays the number of days in a month. 
 * The program should take a month number (1 for January, 2 for February, and so on till*/
public class Calinder {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the month number");
		int num = scan.nextInt();
		month(num);
		scan.close();
     }
	static void month(int num)
	{
		switch(num) {
		
		case 1:
		{
			System.out.println("January - 31 days");
		}
		case 2:
		{
			System.out.println("February - 28 days");
		}
		case 3:
		{
			System.out.println("March - 31 days");
		}
		case 4:
		{
			System.out.println("April - 30 days");
		}
		case 5:
		{
			System.out.println("May - 31 days");
		}
		case 6:
		{
			System.out.println("June - 30 days");
		}
		case 7:
		{
			System.out.println("July - 31 days");
		}
		case 8:
		{
			System.out.println("August - 31 days");
		}
		case 9:
		{
			System.out.println("Septumber - 30 days");
		}
		case 10:
		{
			System.out.println("October - 31 days");
		}
		case 11:
		{
			System.out.println("November - 30 days");
		}
		case 12:
		{
			System.out.println("December - 31 days");
		}
		}
	}

}
