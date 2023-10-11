package Recursion1;

public class FactorialUsingRecursionApp {

	public int factorial(int input)
	{
		if(input==1)
		{
			return 1;
		}
		else
		{
			return input*factorial(input-1);
		}
	}
}
