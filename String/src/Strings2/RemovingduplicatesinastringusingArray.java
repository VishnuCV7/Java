package Strings2;

import java.util.Scanner;

public class RemovingduplicatesinastringusingArray {

	public static void main(String[] args) {

		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the array");
		String s1=scan.next();
		char[] arr=s1.toCharArray();
		
		
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
		}
		scan.close();
	}

}
