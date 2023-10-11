package ArrayWork1;

public class CountEvenorOddElementsinArray {

	public void countEvenorOddElement(int []arr,int even,int odd)
	{
		even=0;
	    odd=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}
		System.out.println("The number of even elements in the array = "+even);
		System.out.println("The number of odd elements in the array = "+odd);
	}
}
