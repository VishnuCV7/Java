package ElseifLadder;

import java.util.Scanner;

/* You are creating a game where players choose their characters based on characteristics associated with Zodiac signs.
 *  The program should take a Zodiac sign as input and print the characteristic associated with that Zodiac sign. 
 *  Consider the following characteristics: Aries - Adventurous, Taurus - Dependable, Gemini - Expressive, 
 *  Cancer - Intuitive, Leo - Passionate, Virgo - Analytical, Libra - Diplomatic, Scorpio - Determined, 
 *  Sagittarius - Philosophical, Capricorn - Organized, Aquarius - Original, Pisces - Compassionate.*/
public class Gamecharecter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your zodiac sign.");
		String sign = scan.nextLine();
		game(sign);
		scan.close();
		}
	static void game(String sign)
	{
		switch(sign)
		{
		case("aries"):
		{
			System.out.println("adventurous");
			break;
		}
		case("taurus"):
		{
			System.out.println("dependable");
			break;
		}
		case("gemini"):
		{
			System.out.println("Expressive");
			break;
		}
		case("Cancer"):
		{
			System.out.println("Intuitive");
			break;
		}
		case("leo"):
		{
			System.out.println("Passionate");
			break;
		}
		case("virgo"):
		{
			System.out.println("Analytical");
			break;
		}
		case("libra"):
		{
			System.out.println("Diplomatic");
			break;
		}
		case("scorpio"):
		{
			System.out.println("Determined");
			break;
		}
		case("sagittarius"):
		{
			System.out.println("Philosophical");
			break;
		}
		case("capricorn"):
		{
			System.out.println("Organized");
			break;
		}
		case("aquarius"):
		{
			System.out.println("Original");
			break;
		}
		case("pisces"):
		{
			System.out.println("Compassionate");
			break;
		}
		}
	}

}
