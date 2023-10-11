package welcome;

import java.util.Scanner;

//Write a program to accept a char and find weather it is a vowel or consonant.
public class Chara {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a character.");
		char alpa = scan.next().charAt(0);
		if(alpa=='a'||alpa=='A')
		{
			System.out.println("The entered character "+alpa+" is a vowel.");
		}
		else if(alpa=='e'||alpa=='E')
		{
			System.out.println("The entered character "+alpa+" is a vowel.");
		}
		else if(alpa=='i'||alpa=='I')
		{
			System.out.println("The entered character "+alpa+" is a vowel.");
		}
		else if(alpa=='o'||alpa=='O')
		{
			System.out.println("The entered character "+alpa+" is a vowel.");
		}
		else if(alpa=='u'||alpa=='U')
		{
			System.out.println("The entered character "+alpa+" is a vowel.");
		}
		else
		{
			System.out.println("The entered character "+alpa+" is a consonant");
		}
scan.close();
	}

}
