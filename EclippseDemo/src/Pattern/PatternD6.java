package Pattern;

public class PatternD6 {

	public static void main(String[] args) {
		pat();
		
	}
	static void pat()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i<=6-j)
				{
				System.out.print(i);
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
