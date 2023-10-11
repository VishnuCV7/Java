package Work;

import java.util.Scanner;

public class Cuberoot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number.");
		int a = scan.nextInt();
		cuber(a);
		scan.close();
	}
	static void cuber(int a)
	{
		double res = Math.cbrt(a);
		System.out.println("cuberoot of "+a+" = "+res);
		
		
	}

}
