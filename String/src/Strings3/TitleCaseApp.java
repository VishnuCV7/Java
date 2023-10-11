package Strings3;

public class TitleCaseApp {

	public String firstUpper(String s1)
	{
		StringBuffer sb1 = new StringBuffer();
		String[] arr=s1.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			char[] brr=arr[i].toCharArray();
			for(int j=0;j<brr.length;j++)
			{
			if(brr[0]>=97 && brr[0]<=122)
			{
				brr[0]=(char)(brr[0]-32);
			}
			}
		
		
		for(char c:brr)
		{
			sb1.append(c);
		}
		sb1.append(" ");
		}
		return sb1.toString();
		
	}
}
