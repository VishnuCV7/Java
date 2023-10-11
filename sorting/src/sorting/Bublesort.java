package sorting;

import java.util.Scanner;

//Assending bubble sort.
public class Bublesort {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int arr[]=new int[s.nextInt()];
		System.out.println("Enter the elements in the array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		
		for(int i=0;i<arr.length;i++)
		{
			int temp=0;
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		s.close();
	}
}

		//output:-(-19 -2 0 2 5 10 12 )

		