package Array;

import java.util.Scanner;

public class Twodarrayofstring {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String arr[][];
		//array declaration
		
		System.out.println("Enter the number of batches");
		int a = scan.nextInt();
		//array creation
		
		arr = new String[a][];
		//array initialization.
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the number of friends in A"+(i+1)+" batch");
			arr[i]= new String[scan.nextInt()];
			System.out.println("Enter the names of friends in batch A"+(i+1));
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("Enter the name of friend "+(j+1));
				arr[i][j]=scan.next();
			}
		}
		twod(arr);
		scan.close();
		
	}
	static void twod(String arr[][])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("------Batch A"+(i+1)+" friends------");
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println(arr[i][j]);
			}
		}
	}

}
