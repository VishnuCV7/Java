import java.util.Scanner;

public class Sumofoddnum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range.");
		int range = scan.nextInt();
		oddnum(range);
		scan.close();
	}
	static void oddnum(int range)
	{
		int i=1,sum=0;
		while(i<=range)
		{
			if(i%2!=0)
			{
				sum = sum+i;
			}
			i++;
		}
		System.out.println(sum);
	}

}
