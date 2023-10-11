package sorting;

import java.util.Scanner;

public class Selectionsorting {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range of the array");
		

		int []arr= new int[scan.nextInt()];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the "+(i+1)+" element into the array");
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			int smallest=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[smallest]>arr[j])
				{
					smallest=j;
				}
			}
			int temp=arr[smallest];
			arr[smallest]=arr[i];
			arr[i]=temp;
		}
		selection(arr);
		scan.close();
	}
	public static void selection(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}