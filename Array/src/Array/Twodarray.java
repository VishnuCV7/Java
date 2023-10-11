package Array;

import java.util.Scanner;

public class Twodarray {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number of students.");
		int a = scan.nextInt();
		System.out.println("Enter the number of subjects.");
		int b = scan.nextInt();
		//array declaration and creation.
		int[][] arr=new int[a][b];
		//array initialization
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the student "+(i+1)+" data.");
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("Enter the marks for subject "+(j+1));
				arr[i][j]=scan.nextInt();
			}
		}
		twod(arr);
		scan.close();
	}
	static void twod(int arr[][])
	{
		//array traversing.
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("-------Student "+(i+1)+" details-------");
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("Subject "+(j+1)+" marks ="+arr[i][j]);
			}
		}
	}

}
