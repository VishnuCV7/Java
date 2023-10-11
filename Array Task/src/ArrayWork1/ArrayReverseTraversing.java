package ArrayWork1;

import java.util.Scanner;

public class ArrayReverseTraversing {

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
	ArrayresTraversing ar1=new ArrayresTraversing();
	ar1.printarray(arr);
	scan.close();
	}

}
