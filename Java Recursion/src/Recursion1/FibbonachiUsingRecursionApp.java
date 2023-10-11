package Recursion1;

public class FibbonachiUsingRecursionApp {

	public int fibbonachi(int num) {
		if(num>=1)
		{
		return num;
		}
		else
		{
			return fibbonachi(num-1)+fibbonachi(num-2);
		}
		
		
	}
}
