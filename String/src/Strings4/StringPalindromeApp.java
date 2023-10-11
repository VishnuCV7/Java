package Strings4;

public class StringPalindromeApp {

	public String palind(String inputstring)
	{
StringBuffer palindrome = new StringBuffer();
		
		for(int i=inputstring.length()-1;i>=0;i--)
		{
			palindrome=palindrome.append(inputstring.charAt(i));
			
		}
		System.out.println(palindrome);
		
		if(palindrome.toString().equals(inputstring))
		{
			System.out.println("the given string is palindrome");
		}
		else
		{
			System.out.println("the given string is not a palindrome");
		}
		return inputstring;
	}
}
