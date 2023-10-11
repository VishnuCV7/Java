package ArrayWork1;

public class Arrayelementsadd {
	
	
public int sumofarray(int arr[],int sum)
{
	sum=0;
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	
		sum+= arr[i];
	}
	System.out.println();
	return sum;
	
	}

}
