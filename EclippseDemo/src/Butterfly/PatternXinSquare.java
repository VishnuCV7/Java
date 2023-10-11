package Butterfly;

public class PatternXinSquare {

	public static void main(String[] args) {
		pat();
	}
	static void pat()
	{
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=9;j++)
			{
				if(((j==i+j)||(j==(j-i)) || ((i==5) || (j==5))))
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
