package PolymorphismBasic;

public class PaymentApp {

	public static void main(String[] args) {

		Payment p;
		p=new UPI();
		p.bills();
		p.offers();
		p.pay();
		System.out.println(" ");
		p=new Wallet();
		p.bills();
		p.offers();
		p.pay();
		System.out.println(" ");
		p=new Cards();
		p.bills();
		p.offers();
		p.pay();
	}

}
