package Pattern;

public class PatternDe3 {

	public static void main(String[] args) {
		pat();
	}
	static void pat()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j<=i)
				{
					System.out.print((char)(64+j));
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
A    
AB   
ABC  
ABCD 
ABCDE

 */