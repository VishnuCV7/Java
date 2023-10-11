package PolymorphismBasic;

public class UPI extends Payment {

	@Override
	public void pay() {
		System.out.println("Paid via UPI");
	}

}
