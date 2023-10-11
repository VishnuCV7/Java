package ArrayWork1;

import java.util.Scanner;

public class ArrayAddition {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array.");
		int []arr = new int[scan.nextInt()];
		
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the "+(i+1)+" element.");
			arr[i]=scan.nextInt();
		}
		
		Arrayelementsadd a1 = new Arrayelementsadd();
		System.out.println("Sum of array elements = "+a1.sumofarray(arr,0));
		scan.close();
		
	}

}
