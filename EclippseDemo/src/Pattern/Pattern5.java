package Pattern;

public class Pattern5 {

	public static void main(String[] args) {
		pat();
	}
	static void pat()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print((char)(j+64));
			}
			System.out.println("");
		}

	}
}


/*output-AAAAA
BBBBB
CCCCC
DDDDD
EEEEE
*/