package Threedarray;
import java.util.*;
public class threedarrayhardcoadprint {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		//array declaration and creation.
		int[][][] arr=new int[4][][];
		
		
		//array initialization
		arr[0]=new int[3][];
		arr[0][0]=new int[2];
		arr[0][1]=new int[4];
		arr[0][2]=new int[1];
		
		arr[1] = new int[2][];
		arr[1][0]=new int[3];
		arr[1][1]=new int[4];
		
		
		arr[2]=new int[2][];
		arr[2][0]=new int[2];
		arr[2][1]=new int[1];
		
		arr[3]= new int[3][];
		arr[3][0]=new int[2];
		arr[3][1]=new int[2];
		arr[3][2]=new int[2];
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("Enter the array "+(j+1)+" elements.");
				for(int k=0;k<arr[i][j].length;k++)
				{
					System.out.println("Enter the element "+(k+1));
					arr[i][j][k]=scan.nextInt();
				}
			}
		}
		array(arr);
		scan.close();
	}
	public static void array(int[][][] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println();
				for(int k=0;k<arr[i][j].length;k++)
				{
					System.out.print(arr[i][j][k]+" ");
				}
			}
			System.out.println();
		}
	}

}
