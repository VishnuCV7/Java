package Work;

import java.util.Scanner;

public class Smallest {

			public static void main(String[] args) {
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter the digit.");
				int num = scan.nextInt();
				larg(num);
				scan.close();
			}
			static void larg(int num)
			{
				int dig = 0,temp = 100;
				while(num>0)
				{
					dig = num%10;
					if(temp>dig)
					{
						temp=dig;
					}
					num=num/10;
				}
				System.out.print(dig);
			}

		

	}


