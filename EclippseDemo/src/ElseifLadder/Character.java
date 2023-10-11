package ElseifLadder;

import java.util.Scanner;

/* You're designing a software that teaches young kids about different types of characters. 
 * The program should take a character as input. If it's a lowercase vowel, it should print "Lowercase Vowel". 
 * If it's an uppercase vowel, it should print "Uppercase Vowel". 
 * If it's a lowercase consonant, it should print "Lowercase Consonant". 
 * If it's an uppercase consonant, it should print "Uppercase Consonant". If it's a digit, it should print "Digit". 
 * For all other characters, it should print "Special Character".*/
public class Character {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a character.");
		char cha = scan.next().charAt(0);
		chare(cha);
		scan.close();
	}
	static void chare(char cha)
	{
		int unicode = cha;
		if(unicode>=65 && unicode<=90)
			{
				if(cha =='A'||cha=='E'||cha=='I'||cha=='O'||cha=='U')
					{
						System.out.println("uppercase vowel.");
					}
				else
					{
						System.out.println("Uppercase Consonant");
					}
			}
		else if(unicode>=97 && unicode<=122)
			{
				if(cha =='a'||cha=='e'||cha=='i'||cha=='o'||cha=='u')
					{
						System.out.println("Lowercase Vowel");
					}
				else
					{
						System.out.println("Lowercase Consonant");
					}
			}
		else if(unicode>=48 && unicode<=57)
			{
				System.out.println("Digits.");
			}
		else
			System.out.println("Special character.");
	}

}
