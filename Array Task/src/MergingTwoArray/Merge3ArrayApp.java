package MergingTwoArray;

import java.util.Scanner;

public class Merge3ArrayApp {

	public static void main(String[] args) {

		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the range of 1st array.");
		int[] arr=new int[scan.nextInt()];
		System.out.println("Enter the range of 2nd array.");
		int[] brr=new int[scan.nextInt()];
		System.out.println("Enter the range of 3rd array.");
		int[] crr=new int[scan.nextInt()];
		
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the 1st array element "+(i+1));
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<brr.length;i++)
		{
			System.out.println("Enter the 2nd array element "+(i+1));
			brr[i]=scan.nextInt();
		}
		for(int i=0;i<crr.length;i++)
		{
			System.out.println("Enter the 3rd array element "+(i+1));
			crr[i]=scan.nextInt();
		}
		
		Merge3Array merge3array = new Merge3Array();
		merge3array.Merge3array(arr,brr,crr);
		scan.close();
	}

}





/*output:-Enter the range of 1st array.
3
Enter the range of 2nd array.
2
Enter the range of 3rd array.
4
Enter the 1st array element 1
1
Enter the 1st array element 2
2
Enter the 1st array element 3
3
Enter the 2nd array element 1
10
Enter the 2nd array element 2
20
Enter the 3rd array element 1
30
Enter the 3rd array element 2
200
Enter the 3rd array element 3
300
Enter the 3rd array element 4
400
*************************
1 2 3 10 20 30 200 300 400 
*************************
*/