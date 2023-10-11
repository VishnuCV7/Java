package MergingTwoArray;

public class Merge3Array {

	public int[] Merge3array(int[] arr,int[] brr,int[] crr)
	{
		int[] drr=new int[arr.length+brr.length+crr.length];
		for(int i=0;i<arr.length;i++)
		{
			drr[i]=arr[i];
		}
		
		for(int i=0;i<brr.length;i++)
		{
			drr[arr.length+i]=brr[i];
			
		}
	
		for(int i=0;i<crr.length;i++)
		{
			drr[arr.length+brr.length+i]=crr[i];
			
		}
		
		System.out.println("*************************");
		for(int i=0;i<drr.length;i++)
		{
			System.out.print(drr[i]+" ");
		}
		System.out.println();
		System.out.println("*************************");
		return drr;
		
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