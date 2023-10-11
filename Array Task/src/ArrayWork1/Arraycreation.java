package ArrayWork1;

import java.util.Scanner;

public class Arraycreation {

	public static void main(String[] args) {

		Scanner scan =  new Scanner(System.in);
		System.out.println("Enter the size of the array.");
		//array declaration and creation
		int []arr=new int[scan.nextInt()];
		//array initialization
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the "+(i+1)+" element.");
			arr[i]=scan.nextInt();
			
		}
		
	
	//creation of the object to call the array traversing
	Arrayttraversing ar1=new Arrayttraversing();
	ar1.printarrayElements(arr);
	scan.close();
	
	}
}
