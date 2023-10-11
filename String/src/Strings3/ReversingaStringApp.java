package Strings3;

public class ReversingaStringApp {

	public String reverse(String s1) 
	{
		char[] arr=s1.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=65 && arr[i]<=90)
			{
				arr[i]=(char)(arr[i]+32);
			}
			else if(arr[i]>=97 && arr[i]<=122)
			{
				arr[i]=(char)(arr[i]-32);
			}
			
		}
		StringBuffer sb1= new StringBuffer();
		for(char c: arr)
		{
			sb1.append(c);
		}
		return sb1.toString();
		
		
	}

}
