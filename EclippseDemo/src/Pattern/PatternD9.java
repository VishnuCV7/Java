package Pattern;

public class PatternD9 {

	public static void main(String[] args) {
		pat();
	}
	static void pat()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j<=6-i)
				{
					System.out.print(j);
				}
			}
			System.out.println("");
		}
	}

}