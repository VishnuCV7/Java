package ShapesUsingPolymorphism;

public class Square extends Shapes {

	@Override
	public void draw() {
		System.out.println("Draw Square");
	}

	@Override
	public double calArea() {
		double s=4;
		return s*s;
	}

}
