package welcome;

import java.util.Scanner;

/*You are participating in a coding competition at your school.
 The challenge is to create a method that can double the value of any number provided.
 This method will help in the game design where scores need to be doubled under certain conditions.*/
public class DoubleTrouble {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the score to be doubled");
		int score = scan.nextInt();
		doubleTheNumber(score);
		scan.close();
		

	}
	public static int doubleTheNumber(int score)
	{
		int Finalscore = score*2;
		System.out.println("The Final score = " +Finalscore);
		return Finalscore;
		
	}

}
