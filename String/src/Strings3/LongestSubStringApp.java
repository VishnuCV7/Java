package Strings3;

public class LongestSubStringApp {

	public String longest(String s1) {
		
		StringBuffer sb1=new StringBuffer();
		String[] arr=s1.split(" ");
		String temp="";
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i].length()>arr[j].length())
				{
					temp=arr[i];
				}
			}
		}
		sb1.append(temp);
		return sb1.toString();
	}
}
