package Sortandsearch;

import java.util.Scanner;

public class Bubblesortandsearch {

	public static  void name(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array.");
		int []arr=new int[scan.nextInt()];
		
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the "+(i+1)+" element in the array");
			arr[i]=scan.nextInt();
		}
		
		sort(arr);
		scan.close();
		
	}
	
	
	public static void sort(int[] arr)
	{
		int temp=0;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]<arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
			System.out.print(arr[i]);
		}
	}
}
