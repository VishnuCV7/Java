import java.util.Scanner;

public class SeperatingOddAndEvenInAString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range of the array");
		int j=scan.nextInt();
		int []arr=new int[j];
		int []brr=new int[j];
		int []crr=new int[j];
		System.out.println("Enter the array elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		for(int i=0;i<arr.length-1;i++)
		{
//			int temp=0;
			
				if(arr[i]%2==0)
				{
					brr[i]=arr[i];
				}
				else
				{
					crr[i]=arr[j];
				}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(brr[i]+crr[i]);
		}
		scan.close();
	}

}
