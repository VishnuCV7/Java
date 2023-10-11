package Recursion1;

public class GCDUsingRecursionApp {
	public int gcd(int n1,int n2)
	{
		if(n2==0)
		{
			return n1;
		}
		else
		{
			return gcd(n2,n1%n2);
		}
		
	}

}
