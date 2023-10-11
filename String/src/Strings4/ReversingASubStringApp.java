package Strings4;

public class ReversingASubStringApp {

	public String reverseofaString(String input)
	{
		
		
		StringBuffer sb = new StringBuffer();
		String[] arr=input.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			char[] brr=arr[i].toCharArray();
			for(int j=brr.length-1;j>=0;j--)
			
			{
				sb=sb.append(brr[j]);
			}
			
			sb.append(" ");
		}
		
		
		return sb.toString();
		
	}
}
