package Pattern;

public class PyramidPat3 {

	public static void main(String[] args) {
		pym();
	}
	static void pym()
	{
		int k=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=9;j++)
			{
					if(j>=(6-i) && j<=(i+4) && k==1)
					{
					System.out.print("*");
					k=0;
					}
				
				else
				{
					System.out.print(" ");
					k=1;
				}
				
			}
			System.out.println("");
		}
	}
	
	
	
	/*output-     *    
                 * *   
                * * *  
               * * * * 
              * * * * *     */

}
