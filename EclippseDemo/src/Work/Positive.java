package Work;

import java.util.Scanner;

public class Positive {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		if(num > 0)
		{
			System.out.println("Positive Number.");
		}
		scan.close();

	}

}
