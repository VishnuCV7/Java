package Pattern;

public class PatternDe1 {

	public static void main(String[] args) {
		pat();
	}
	static void pat()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i>=j)
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



/*output-
1    
22   
333  
4444 
55555

 */