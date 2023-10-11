package Array;

import java.util.Scanner;

public class Twodarraydiffleng {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//array declaration.
		int[][] arr;
		//array creation.
		arr= new int[2][];
		//array initialization.
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the range of "+(i+1)+" array");
			arr[i]= new int[scan.nextInt()];
			System.out.println("Enter the data in array"+(i+1));
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("Enter the "+(j+1)+" data.");
				arr[i][j]=scan.nextInt();

			}
		}
		
		twod(arr);
		scan.close();
	}
	static void twod(int arr[][])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println(arr[i][j]);
			}
		}
	}

}
