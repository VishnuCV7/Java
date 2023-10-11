package welcome;

public class Chai {
	 public static void main(String[]args) {
	    	makeChai();
	    	makeChai(5);
	    	makeChai("Masala Chai",10);
	    	makeChai(1,"Badam Milk");
	    	
	     }
	    private static void makeChai(int quantity, String flavour) {
	    	System.out.println("The cost of Badam Milk = 15");
	    	System.out.println("The chai for " + quantity + " costs = " + (quantity*15));
		
	}
		private static void makeChai(String flavour, int quantity) {
	    	 System.out.println("The cost of Masala Chai = 15");
	    	 System.out.println("The chai for " + quantity + " costs = " + (quantity*15));
	}
		private static void makeChai() {
			System.out.println("The cost of chai = 10");
		}
		private static void makeChai(int quantity) {
			System.out.println("The chai for " + quantity + " costs = " + (quantity*15));
		}
	}

