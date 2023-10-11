package ShapesUsingPolymorphism;

public class Circle extends Shapes {

	@Override
	public void draw() {
		System.out.println("Draw Circle");
	}

	@Override
	public double calArea() {
		double r=2.5;
		return Math.PI*r*r;
	}

}
