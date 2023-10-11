package ElseifLadder;

import java.util.Scanner;

/* You're creating a game that includes a feature to check if a player has found a special item in the game. 
 * The special item is found if the player has more than 10 gold coins, the player's level is above 5,
 * and the player has a special key. 
 * The program should first check if the player has more than 10 gold coins and then if the player's level is above 5. 
 * If both conditions are met, the program should check if the player has the special key. If all conditions are met, 
 * it should print "Special Item Found".*/
public class Game {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of gold coins.");
		int coin = scan.nextInt();
		System.out.println("Enter the players level.");
		int level = scan.nextInt();
		boolean specialkey = gamer(coin,level);
		if(specialkey == true)
		{
			System.out.println("Special Item Found");
		}
		scan.close();
	}
	static boolean gamer(int coin,int level)
	{
		if(coin >= 10)
		{
			if(level >= 5)
			{
				return true;
			}
		}
		return false;
	}

}
