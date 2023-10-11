package PolymorphismBasic;

public class Cards extends Payment {

	@Override
	public void pay() {
		System.out.println("Paid via Cards"); 
	}

}
