package welcome;
/*You are creating a new social networking site. In one of the features,
 you have to combine the user's first name and last name to display the full name.
 Your task is to write a static method that will concatenate two strings.*/
import java.util.Scanner;

public class FullName {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first name.");
		String FirstName = scan.nextLine();
		System.out.println("Enter your last name");
		String LastName = scan.nextLine();
		joinStrings(FirstName,LastName);
		scan.close();

	}
public static String joinStrings(String FirstName,String LastName)
{
	String FullName = FirstName + LastName;
	System.out.println("FullName = " + FullName);
	return FullName;
}
}
