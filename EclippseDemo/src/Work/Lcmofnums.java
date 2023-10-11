package Work;
import  java.util.Scanner;
public class Lcmofnums {

	    // Function to calculate the Greatest Common Divisor (GCD)
	    private static int gcd(int a, int b) {
	        if (b == 0) {
	            return a;
	        } else {
	            return gcd(b, a % b);
	        }
	    }

	    // Function to calculate the Least Common Multiple (LCM)
	    private static int lcm(int a, int b) {
	        return (a * b) / gcd(a, b);
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the first integer: ");
	        int num1 = scanner.nextInt();

	        System.out.print("Enter the second integer: ");
	        int num2 = scanner.nextInt();

	        int result = lcm(num1, num2);
	        System.out.println("The Least Common Multiple (LCM) of " + num1 + " and " + num2 + " is: " + result);
	        scanner.close();
	    }
	}

