package welcome;
/*You are a programmer in a school. The mathematics teacher has asked for your help to teach basic arithmetic operations to students. 
 Your task is to create a set of methods that will do subtraction, multiplication, division, and find the remainder of two numbers.*/

import java.util.Scanner;

public class MathOp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers..");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		subtract(num1,num2 );
		multiplyNumbers(num1,num2);
		divideNumbers(num1,num2);
		findRemainder(num1,num2);
		scan.close();
	}
		
		public static int subtract(int num1, int num2)
		{
			int result = num1 - num2;
			System.out.println("Difference =" + result);
			return result;
		}
		
		
		public static int multiplyNumbers(int num1, int num2)
		{
			int result = num1 * num2;
			System.out.println("Product =" + result);
			return result;
		}
		public static double divideNumbers(int num1, int num2)
		{
			double result = (double)num1 / num2;
			System.out.println("Quotiant = ");
			return result;
		}
		public static int findRemainder(int num1, int num2)
		{
			int result = num1 % num2;
			System.out.println("Remainder =" + result);
			return result;
		}
}


