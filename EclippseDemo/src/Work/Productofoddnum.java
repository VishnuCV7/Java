package Work;

import java.util.Scanner;

public class Productofoddnum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range");
		int r = scan.nextInt();
		oddpro(r);
		scan.close();
	}
	static void oddpro(int r)
	{
		double pro = 1;
		int i =1;
		do
		{
			if(r%2!=0)
			{
				pro=pro*i;
			}
			i++;
			System.out.println(pro);
		}
		while(i>=r);
		{
			
		}
		
	}

}
