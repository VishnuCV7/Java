package Searching;

public class BinarySearchApp {
	

public void Binarysearch(int[] arr, int key) {
	
	
	boolean iselementfound=false;
	int low=0;
	int high=arr.length-1;
	int mid=0;
	
	while(low<=high)
	{
		mid=  (low+high) / 2;
		
		if(arr[mid]==key)
		{
			iselementfound = true;
			break;
		}
		else if(arr[mid]>key)
		{
			high=mid-1;
		}
		else
		{
			low=mid+1;
		}
		
	}
	if(iselementfound)
	{
		System.out.println("Element is found at "+mid+" index in the array.");
	}
	else
	{
		System.out.println("Element "+key+" is not found in the array.");
	}
	}

}
