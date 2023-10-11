package Strings2;

public class RemoveDuplicateApp {
	public void removeDuplicates(char[] crr,StringBuilder sb1)
	{

	for(int i=0;i<crr.length;i++)
	{
		boolean repeated=false;
		for(int j=i+1;j<crr.length;j++)
		{
			if(crr[i]==crr[j])
			{
				repeated=true;
				break;
			}
			
		}
		if(!repeated)
		{
			sb1.append(crr[i]);
		}
		
		
	}
	System.out.print(sb1);
}
}
