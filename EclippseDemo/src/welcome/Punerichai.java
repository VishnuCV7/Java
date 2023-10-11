package welcome;

public class Punerichai { 
     public static void main(String[]args) {
    	makeChai();
    	makeChai(50);
     }
     private static void makeChai() {
		System.out.println("The cost of chai = 100");
	}
	private static void makeChai(int quantity) {
		System.out.println("The masala chai for " + quantity + "costs = " + (quantity*100));
	}
}