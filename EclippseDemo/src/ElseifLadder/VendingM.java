package ElseifLadder;

import java.util.Scanner;

/*You are developing a software for a vending machine. 
 * The program should take a product code as input and output the product name. 
 * The product codes are 1 for "Coke", 2 for "Pepsi", 3 for "Water", 4 for "Juice", 5 for "Tea".*/
public class VendingM {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the product key");
		int pk = scan.nextInt();
		vend(pk);
		scan.close();
}
	static void vend(int pk)
	{
		switch(pk)
		{
		case 1:
		{
			System.out.println("Coke");
		}
		case 2:
		{
			System.out.println("Pepsi");
		}
		case 3:
		{
			System.out.println("Water");
		}
		case 4:
		{
			System.out.println("Juice");
		}
		case 5:
		{
			System.out.println("Tea");
		}
	}
	

   }
}