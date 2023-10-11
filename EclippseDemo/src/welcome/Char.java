package welcome;
import java.util.Scanner;
public class Char {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a alphabet");
		char alp = scan.next().charAt(0);
		if(alp=='a'||alp=='e'||alp=='i'||alp=='o'||alp=='u'||alp =='A'||alp=='E'||alp=='I'||alp=='O'||alp=='U')
		{
			System.out.println("The charecter" + alp +"is a vowel");
		}
		else
		{
			System.out.println("The character "+ alp+" is a consonant");
		}
		scan.close();

	}

}
