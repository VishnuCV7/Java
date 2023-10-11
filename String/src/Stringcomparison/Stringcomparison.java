package Stringcomparison;

public class Stringcomparison {

	public static void main(String[]args) {
		String s3= "Ram"+"sita";
		String s4= "Ram"+"sita";
		if(s3==s4)
		{
			System.out.println("References are same");
		}
		else
		{
			System.out.println("References are different");
		}
		
		
		if(s3.equals(s4))
		{
			System.out.println("Data is same");
		}
		else
		{
			System.out.println("Different data");
		}
	}
}
