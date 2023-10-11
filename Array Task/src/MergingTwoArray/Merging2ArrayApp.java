package MergingTwoArray;

import java.util.Scanner;

public class Merging2ArrayApp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		//array declaration and creation
		System.out.println("Enter the size of the 1st array.");
		int[] arr=new int[scan.nextInt()];
		System.out.println("Enter the size of the 2nd array.");
		int[] brr=new int[scan.nextInt()];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the array 1 element "+(i+1));
			arr[i]=scan.nextInt();
		}
		
		for(int i=0;i<brr.length;i++)
		{
			System.out.println("Enter the array 2 element "+(i+1));
			brr[i]=scan.nextInt();
		}
		Merging2Array mergingtwoarray = new Merging2Array();
		mergingtwoarray.MergeTwoArray(arr, brr);
		scan.close();
	}

}
