package Array;

import java.util.Scanner;

public class Twodarraysum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array.");
		int a= scan.nextInt();
		System.out.println("Enter the number of elements in array. ");
		int b=scan.nextInt();
		//array declaration and creation.
		int arr[][]=new int[a][b];
		int brr[][]=new int[a][b];
		int crr[][]=new int[a][b];
		
		//array initialization.
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the values in array arr");
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("Enter the values in array "+(i+1)+" and element "+(j+1));
				arr[i][j]=scan.nextInt();
			}
		}
		for(int i=0;i<brr.length;i++)
		{
			System.out.println("Enter the values in array brr");
			for(int j=0;j<brr[i].length;j++)
			{
				System.out.println("Enter the values in array "+(i+1)+" and element "+(j+1));
				brr[i][j]=scan.nextInt();
			}
		}
		scan.close();
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("------The values of crr "+(i+1)+" array------ ");
			for(int j=0;j<arr[i].length;j++)
			{
				crr[i][j]=arr[i][j]+brr[i][j];
				System.out.println("Addition of two array = "+crr[i][j]);
				crr[i][j]=arr[i][j]*brr[i][j];
				System.out.println("Product of two array = "+crr[i][j]);
			}
		}

	}

}
