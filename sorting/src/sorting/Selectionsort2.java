package sorting;

public class Selectionsort2 {

	public static void main(String[] args) {
		
		int arr[]= {2,-2,0,1,-19,-50,120,90};
		for(int i=0;i<arr.length;i++)
		{
			int smallest=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[smallest]>arr[j])
				{
					smallest=j;
				}
			}
			int temp=arr[smallest];
			arr[smallest]=arr[i];
			arr[i]=temp;
		}
		selection(arr);
	}
	public static void selection(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}

//output:-(120 50 9 2 -1 -10 -19) 
