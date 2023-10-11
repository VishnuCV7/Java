package Stringcomparison;

public class Stringcomp2 {
	public static void main(String []args) {

	String s1= "Ram";
	String s2= "Sita";
	String s3= s1+s2;
	String s4= s1+s2;
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
	
	
	String s5="Raja Ram Mohan Roy";
	
	
	System.out.println(s5.length());
	
	System.out.println(s5.startsWith("Raja"));
	
	System.out.println(s5.endsWith("Roy"));
	
	System.out.println(s5.toCharArray());
	
	System.out.println(s5.trim());
	
	System.out.println(s5.split(" "));
	
	System.out.println(s5.replace('R', 'T'));
	
	System.out.println(s5.replaceAll("Raja","Siddesh" ));
}
}
