package Work;

import java.util.Scanner;

/*You're creating a typing software that helps users improve their typing skills. 
 *One part of the software focuses on capital letters. Your program should accept a character as input.
 *If the character is a capital letter, the program should print "Capital letter detected".*/
public class Alphabet {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a character.");
		char alp = scan.next().charAt(0);
		alpha(alp);
		scan.close();
	}
	static void alpha(char alp)
	{
		if(alp>='A'&&alp<='Z')
		{
			System.out.println(alp+ " is a capital letter.");
		}
	}

}
