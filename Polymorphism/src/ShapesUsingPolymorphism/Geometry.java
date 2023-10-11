package ShapesUsingPolymorphism;

public class Geometry {
	public void doActivity(Shapes sh) {
		sh.draw();
		System.out.println(sh.calArea());
	}

}
