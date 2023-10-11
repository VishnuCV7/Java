package Pattern;

public class PyramidPat4 {

	public static void main(String[] args) {
		pym();
	}
	static void pym()
	{
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j<=i && i<=6-j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}

}


