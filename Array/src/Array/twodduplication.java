package Array;

import java.util.Scanner;

public class twodduplication {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array.");
		int arr[]=new int[scan.nextInt()];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the vlaue in the element.");
			arr[i]=scan.nextInt();
		}
		int k=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					k=j;
					break;
				}
			}
		}
		System.out.println("The dupilcate value = "+arr[k]);
		scan.close();
	}

}
