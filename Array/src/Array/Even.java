package Array;

import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range of the array.");
		int[] arr = new int[scan.nextInt()]; 
	
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the "+(i+1)+" data");
			arr[i] = scan.nextInt();
			
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]+" is even.");
			}
			else
			{
				System.out.println(arr[i]+" is odd.");
			}
			
			scan.close();
		}
	}

}
