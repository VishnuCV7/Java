package ElseifLadder;

import java.util.Scanner;

/* As part of a game, you're creating a feature that takes a Roman numeral as input and returns the corresponding decimal number.
 *  The Roman numerals from 1 to 5 are I, II, III, IV, V.*/
public class Roman {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Roman Numerals.");
		String rom = scan.nextLine();
		romn(rom);
		scan.close();
		
	}
	static void romn(String rom)
	{
		if(rom.equals("I"))
		{
			System.out.println("1");
		}
		else if(rom.equals("II"))
		{
			System.out.println("2");
		}
		else if(rom.equals("III"))
		{
			System.out.println("3");
		}
		else if(rom.equals("IV"))
		{
			System.out.println("4");
		}
		else if(rom.equals("V"))
		{
			System.out.println("5");
		}
	}

}
