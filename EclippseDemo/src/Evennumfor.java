import java.util.Scanner;

public class Evennumfor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range.");
		int range = scan.nextInt();
		even(range);
		scan.close();
	}
	static void even(int range)
	{
		for(int i = 0;i<=range;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}

}
