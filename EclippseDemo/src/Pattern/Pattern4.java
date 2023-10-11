package Pattern;

public class Pattern4 {

	public static void main(String[] args) {
		pat();
	}
	static void pat()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print((char)(i+64));
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