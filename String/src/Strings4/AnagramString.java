package Strings4;

import java.util.Scanner;

public class AnagramString {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first string");
		String s1=scan.next();
		System.out.println("Enter the second string");
		String s2=scan.next();
		
		
	
		if(s1.length()==s2.length())
		{
		char[] arr=s1.toCharArray();
		char[] brr=s2.toCharArray();
		
		boolean isAnagram=false;
		int count=0;
		
		
			for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<brr.length;j++)
				{
					if(arr[i]==brr[j])
					{
						count++;
						break;
					}
				}
			}
		
		
		if(count==s1.length())
		{
			isAnagram=true;
			if(!isAnagram)
			{
				System.out.println("the strings are anagram");
			}
		}
		scan.close();
	}
	}
}
