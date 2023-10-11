package Array;

import java.util.Scanner;

public class Stringinarray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range.");
		String[] arr = new String[scan.nextInt()];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the "+(i+1)+" data.");
			arr[i]= scan.next();
		}
		string(arr);
		scan.close();
	}
	static void string(String arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
		System.out.println(arr[i]);
		}
	}

}
