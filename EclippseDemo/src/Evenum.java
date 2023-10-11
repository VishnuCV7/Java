import java.util.Scanner;

public class Evenum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range.");
		int n = scan.nextInt();
		eve(n);
		scan.close();
	}
	static void eve(int n)
	{
		int i=1;
		while(i<=n)
		{
			
			if(i%2 == 0)
			{
				System.out.println(i);
			}
			i++;
			}
			
		}
	}


