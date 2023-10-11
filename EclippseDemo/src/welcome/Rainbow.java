package welcome;

import java.util.Scanner;

public class Rainbow {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the charecter");
		char color = scan.next().charAt(0);
		if(color =='V'||color =='v')
		{
			System.out.println("Violet a rainbow color.");
		}
		else if(color =='I'||color =='i')
		{
			System.out.println("Indigo a rainbow color.");
		}
		else if(color =='B'||color =='b')
		{
			System.out.println("Blue a rainbow color.");
		}
		else if(color =='G'||color =='g')
		{
			System.out.println("Green a rainbow color.");
		}
		else if(color =='Y'||color =='y')
		{
			System.out.println("Yellow a rainbow color.");
		}
		else if(color =='O'||color =='o')
		{
			System.out.println("Orange a rainbow color.");
		}
		else if(color =='R'||color =='r')
		{
			System.out.println("Red a rainbow color.");
		}
		else
		{
			System.out.println("Not a rainbow color.");
		}
		scan.close();
		
	}

}
