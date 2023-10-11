package ShapesUsingPolymorphism;

public class Rectangle extends Shapes {

	@Override
	public void draw() {
		System.out.println("Draw Rectangle");
	}

	@Override
	public double calArea() {
		double l=5.5,b=7;
		return l*b;
	}

		
	
}
