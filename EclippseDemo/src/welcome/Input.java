package welcome;

import java.util.Scanner;

public class Input {
	int id;
	String Name;
	String skills;
	
	static void train()
	{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the topic to train on.");
	String topic = scan.nextLine();
	System.out.println("Train on " + topic);
	scan.close();
	
	}
	static void work()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the work to be done.");
		String topic = scan.nextLine();
		System.out.println("Complete thework on " + topic);
		scan.close();
	}
	void giveData(int a,String b,String c)
	{
		id = a;
		Name = b;
		skills = c;
	}
}
