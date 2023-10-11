package Array;

import java.util.Scanner;

public class Numpresentornot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//array declaration and creation.
		System.out.println("Enter the range of the array.");
		int arr[] = new int[scan.nextInt()];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the "+(i+1)+" data.");
			arr[i]=scan.nextInt();
		}
		evencount(arr);
		scan.close();
		//array initialization.
	}
	static void evencount(int arr[])
		{
			
		
		
		// number of even number. 
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			
			if(arr[i]%2==0)
			{
				count++;
			}
			
		}
		System.out.println("the number of even number = "+count);
		}
		
		
	}



