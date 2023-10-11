package Searching;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array size");
		int arr[]=new int[scan.nextInt()];
		
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the "+(i+1)+" elements of the array");
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the key to be found.");
		int key = scan.nextInt();
		BinarySearchApp binarysearching =new BinarySearchApp();
		binarysearching.Binarysearch( arr, key);
		scan.close();
	}
	
	
}
