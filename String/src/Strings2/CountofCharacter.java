package Strings2;

import java.util.Scanner;

public class CountofCharacter {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=scan.next();  
		System.out.println("enter the char to know the count");
		char alp=scan.next().charAt(0);
		int count=0;
		char[] arr=s1.toCharArray();
		
		for(int i=0;i<arr.length;i++)
		
		{
			if(arr[i]==alp)
			{
				count++;
			}
		}
			
		System.out.println("The number of duplicates are = "+count);
		scan.close();
		
		
		
		
		}

}
