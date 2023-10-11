package welcome;

import java.util.Scanner;

public class SwapTwo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of x and y.");
		int x = scan.nextInt();
		int y = scan.nextInt();
		System.out.println("Before Swaping x = "+x+"y = "+y);
		int temp;
		
		temp = x;
		x=y;
		y = temp;
		System.out.println("After swapping x = " +x+ "y = "+y );
		scan.close();

	}

}
