package Searching;

import java.util.Scanner;

public class LinearSerching {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array.");
		int arr[]= new int[scan.nextInt()];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the " +(i+1)+" array elements");
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the key to be found.");
		int key= scan.nextInt();
		linearsearch(arr,key);
		scan.close();
	}
	
	
	static void linearsearch(int[] arr,int key)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				System.out.println("The key element "+key+" is in the index "+i+" of the array.");
			}
			
		}
		
		System.out.println();
	}

}
