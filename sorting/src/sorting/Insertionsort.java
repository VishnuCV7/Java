package sorting;

public class Insertionsort {

	public static void main(String[] args) {
		int[] arr= {5,2,0,-2,4};
		for(int i=0;i<arr.length;i++)
		{
			int current = arr[i];
			int j=i-1;
			while(j>=0 && current<arr[j])
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=current;
		}
		insertion(arr);
	}
	public static void insertion(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}


