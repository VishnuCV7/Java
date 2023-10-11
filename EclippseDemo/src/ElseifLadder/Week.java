package ElseifLadder;

import java.util.Scanner;

/*You are developing a weekday management software for a company. 
 * The program should take a weekday number (1 for Monday, 2 for Tuesday, 
 * and so on till 7 for Sunday) and print the corresponding day.*/
public class Week {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the weekday number");
		int num = scan.nextInt();
		weekd(num);
		scan.close();
    }
	static void weekd(int num)
	{
		switch(num){
		
		case 1:
		{
			System.out.println("Monmday");
		}
		case 2:
		{
			System.out.println("Tuesday");
		}
		case 3:
		{
			System.out.println("Wednesday");
		}
		case 4:
		{
			System.out.println("Thursday");
		}
		case 5:
		{
			System.out.println("Friday");
		}
		case 6:
		{
			System.out.println("Saturday");
		}
		case 7:
		{
			System.out.println("Sunday");
		}
		}
	  
	}

}
