package Array;

import java.util.Scanner;

public class twodarraycars {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String arr[][];
		//array declaration.
		
		System.out.println("Enter the number of brands.");
		int a = scan.nextInt();
		//array creation.
		arr = new String[a][];
		//array initialization.
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the number of car models in the brand "+(i+1));
			arr[i]= new String[scan.nextInt()];
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("Enter the names of model "+(j+1)+" in brand "+(i+1));
				arr[i][j]=scan.next();
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
		System.out.println("Enter the "+(i+1)+" brand name.");
		String b=scan.next();
		System.out.println("Brand name is "+b);
		for(int j=0;j<arr[i].length;j++)
		{
			System.out.println("Model "+(j+1)+" = "+arr[i][j]);
		}
		}
		scan.close();
	}
}