package Work;

import java.util.Scanner;

public class Capital {



	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your username.");
		String username = scan.nextLine();
		System.out.println("Enter your password.");
		String password = scan.nextLine();
		if(username.equals("Vishnu")  &&  password.equals("vishnu123"))
		{
			System.out.println("Login Successful.....");
		}
		else
		{
			System.out.println("Loginn Failed.....");
		}
		scan.close();
	}

}
