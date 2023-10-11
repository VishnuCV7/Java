package Array;

import java.util.Scanner;

public class SquareMatrixSum {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows and coloumns.");
		int a= scan.nextInt();
		int arr[][]=new int[a][a];
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("Enter the value"+(j+1));
				arr[i][j]=scan.nextInt();
				
			}
			
		}
		int sum = 0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(i==j)
				{
					sum=sum+arr[i][j];
				
				}
				else if(i+j==arr.length-1)
				{
					sum=sum+arr[i][j];
				}
			}	
		}
		System.out.println(sum);
		scan.close();


	}
	}	



