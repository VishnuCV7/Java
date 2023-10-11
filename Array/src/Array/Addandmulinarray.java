package Array;

import java.util.Scanner;

public class Addandmulinarray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range of the array 1");
		int arr[] = new int[scan.nextInt()];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the data in arr.");
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the range of the array 2");
		int brr[] = new int[scan.nextInt()];
		for(int i=0;i<brr.length;i++)
		{
			System.out.println("Enter the data in brr.");
			brr[i]=scan.nextInt();
		}
		System.out.println("Enter the range of the array 3");
		int crr[] = new int[scan.nextInt()];
		add(arr,brr,crr);
		scan.close();
	}
	static void add(int []arr,int []brr,int []crr)
	{
		System.out.println("------Addition------");
		for(int i=0;i<arr.length;i++)
		{
			
			crr[i]=arr[i]+brr[i];
			System.out.println("The sum of 1st and 2nd array = "+crr[i]);
		}
		System.out.println("------Multiplication------");
		for(int i=0;i<arr.length;i++)
		{
			
			crr[i]=arr[i]*brr[i];
			System.out.println("The product of 1st and 2nd array = "+crr[i]);
		}
	}

}
