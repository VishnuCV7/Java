package Threedarray;

import java.util.Scanner;

public class threedarrayprint {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	System.out.println("Enter the range of the base array.");		
		int arr[][][] = new int[scan.nextInt()][][];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter the range of "+(i+1)+" array.");
			arr[i]=new int[scan.nextInt()][];
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("enter the range of "+(j+1)+" array "+(i+1));
				arr[i][j]=new int[scan.nextInt()];
				for(int k=0;k<arr[i][j].length;k++)
				{
					System.out.println("enter the data in "+(k+1));
					arr[i][j][k]=scan.nextInt();
				}
			}
		}
		three(arr);
		scan.close();
		
	}
	public static void three(int[][][] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("subarray "+(i+1));
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println();
				for(int k=0;k<arr[i][j].length;k++)
				{
					
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.println();
			}
		}
		System.out.println();
	}

}
