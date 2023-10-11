package Array;

import java.util.Scanner;

public class Positivornegative {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//array declaration and creation.
		System.out.println("Enter the range of the Array.");
		int arr[]=new int[scan.nextInt()];
		//array initialization.
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the "+(i+1)+" data.");
			arr[i]=scan.nextInt();
		}
		int posi = 0;
		int negi = 0;
		int zero = 0;
		count(posi,negi,zero,arr);
		scan.close();
	}
	static void count(int posi,int negi,int zero,int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>0)
			{
				posi++;
			}
			else if(arr[i]==0)
			{
				zero++;
			}
			else
			{
				negi++;
			}
		}
	}

}
