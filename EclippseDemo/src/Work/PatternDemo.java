package Work;

public class PatternDemo {

	public static void main(String[] args) {
		pat();
	}
	static void pat()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print((char)(48+i));
			}
			System.out.println("");
		}
	}

}
