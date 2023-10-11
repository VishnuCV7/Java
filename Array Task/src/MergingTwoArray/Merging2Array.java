package MergingTwoArray;

public class Merging2Array {

		public int[] MergeTwoArray(int[] arr,int[] brr)
		{
			int crr[]=new int[arr.length+brr.length];
			for(int i=0;i<arr.length;i++)
			{
				crr[i]=arr[i];
			}
			int j=0;
				for(int i=arr.length;i<crr.length;i++)
				{
					crr[i]=brr[j];
					j++;
				}
			
			for(int i=0;i<crr.length;i++)
			{
				System.out.print(crr[i]);
			}
			return crr;
			
		}
}
